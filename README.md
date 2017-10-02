To run:

```sh
mvn clean package && docker build -t test .
docker run test
```

If system datetime is 2017-10-02T21:29:55.188 and timezone is GMT+3 (MSK) then output will be:

1) Run JVM with ```-Duser.timezone=GMT+3``` argument:
```
With default TZ: 2017-10-02T21:29:40.736
Without TZ: 2017-10-02T21:29:40.737
Zoned datetime without TZ: 2017-10-02T21:29:40.737+03:00[GMT+03:00]
Zoned datetime with TZ: 2017-10-02T21:29:40.737+03:00[GMT+03:00]
New date: Mon Oct 02 21:29:40 GMT+03:00 2017
Default TZ: 10800000 (3h)
```

2)  Run JVM with ```-Duser.timezone=GMT+3``` argument and use 
```java 
TimeZone.setDefault(TimeZone.getTimeZone("GMT+03"));
```

```
With default TZ: 2017-10-02T21:29:40.736
Without TZ: 2017-10-02T21:29:40.737
Zoned datetime without TZ: 2017-10-02T21:29:40.737+03:00[GMT+03:00]
Zoned datetime with TZ: 2017-10-02T21:29:40.737+03:00[GMT+03:00]
New date: Mon Oct 02 21:29:40 GMT+03:00 2017
Default TZ: 10800000 (3h)
```

