To run:

```sh
mvn clean package && docker build -t test .
docker run test
```

If system datetime is 2017-10-02T21:17:55.188 and timezone is GMT+3 (MSK) then output will be:
```
Local date with default TZ: 2017-10-02T21:17:55.188
Local date without TZ: 2017-10-02T21:17:55.188
Default TZ offset: 10800000 ms (3h)
```
