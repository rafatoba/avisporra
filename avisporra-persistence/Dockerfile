FROM mysql
ENV MYSQL_DATABASE avisporra
ENV MYSQL_ROOT_PASSWORD pass
COPY ./target/liquibase/ /docker-entrypoint-initdb.d/
