
# 使用官方的 OpenJDK 11 镜像作为基础镜像
FROM openjdk:17
LABEL authors="xuzheng"

# 设置工作目录
WORKDIR /app

# 将 Gradle 构建的 JAR 文件复制到镜像中
COPY build/libs/forwork-server-kt-*.jar /app/forwork-server-kt.jar

# 暴露应用程序的端口
EXPOSE 8080

# 定义启动命令
CMD ["java", "-jar", "forwork-server-kt.jar"]