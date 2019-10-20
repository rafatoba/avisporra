# avisporra-persistence
Repository with persistence related files (liquibase...)
If you don't have a mysql installed, or you want to start always fresh, you can create a docker container.
``$ docker run -p 3306:3306 --name hb-mysql-example -e MYSQL_ROOT_PASSWORD=pass -d mysql``
If you want to get in the container to run some queries:
``$ docker exec -it hb-mysql-example bash``
``mysql -u root -ppass``
Once you have a mysql running, you just need to run the next goal in maven (``sudo apt install maven``):
``mvn clean install``
