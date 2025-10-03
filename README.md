Here’s the **Ubuntu-specific setup steps** to run your [Spring Boot Resume app](https://github.com/shilpapan/Resume) on your **EC2 instance**:

---

## ✅ Step-by-Step for Ubuntu EC2

### 1. **Update and Install Prerequisites**

```bash
sudo apt update && sudo apt upgrade -y
sudo apt install git curl wget unzip -y
```

---

### 2. **Install Java (JDK 17)**

```bash
sudo apt install openjdk-17-jdk -y
```

✅ Verify:

```bash
java -version
```

---

### 3. **Install Maven**

```bash
sudo apt install maven -y
```

✅ Verify:

```bash
mvn -version
```

---

### 4. **Clone Your GitHub Repo**

```bash
git clone https://github.com/shilpapan/Resume.git
cd Resume
```

---

### 5. **Build Your Spring Boot Project**

```bash
mvn clean install
```

This will create a JAR in `target/ResumeOnline-1.0-SNAPSHOT.jar`

---

### 6. **Run the App**

```bash
java -jar target/ResumeOnline-1.0-SNAPSHOT.jar
```

---

### 7. **Open Port 8080 in AWS**

In your AWS Console:

* Go to **EC2 > Security Groups**
* Edit the group attached to your EC2
* Add an **inbound rule**:

    * Type: **Custom TCP**
    * Port: **8080**
    * Source: `0.0.0.0/0` (or your IP)

---

### 8. **Access the App**

Go to:

```
http://<your-ec2-public-ip>:8080
```
