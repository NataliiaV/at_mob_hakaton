### Requirenments
- android sdk installed and path configured
- maven installed and path configured
- java installed and path configured
- appium studio installed and running
- emulator is running
- session from appium studio started

### Command:
```
mvn clean installed
```

### Report
Location: `target\surefire-reports\html\overview.html`
Phone performance info will be included in the report in case of test failure

Performance info is always fetched during suite run start and end
(`target/surefire-reports/html/output.html`)