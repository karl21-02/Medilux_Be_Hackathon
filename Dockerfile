# 베이스 이미지 설정
FROM openjdk:17-alpine

# 포트 설정
EXPOSE 8080

# 앱 파일 추가
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# 컨테이너 실행 시 실행할 명령어
ENTRYPOINT ["java","-jar","/app.jar"]
