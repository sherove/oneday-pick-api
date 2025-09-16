# 베이스 이미지 (Java 17 포함된 OS)
FROM openjdk:17-jdk-slim
# 컨테이너 안에서 /app 폴더를 기본 경로로 설정
WORKDIR /app
# 로컬에서 빌드한 JAR 파일을 컨테이너 안 /app/app.jar로 복사
COPY build/libs/*.jar app.jar
# 컨테이너 시작할 때 java -jar app.jar 실행
ENTRYPOINT ["java", "-jar", "app.jar"]