FROM alpine:latest

WORKDIR /app

COPY . .

RUN apk update && apk add openjdk17 mysql-client

EXPOSE 4000

EXPOSE 5000

ENTRYPOINT ["/usr/bin/env", "/usr/lib/jvm/java-17-openjdk-amd64/app/bin/java", "@/tmp/cp_dp2ujappwrip3dun9jv2xiav4.argfile", "App"]
