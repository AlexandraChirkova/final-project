## ✅ ОСНОВНЫЕ КОМАНДЫ ЗАПУСКА

### ▶ 1. Эмулятор (локально, PROD Wikipedia)

```bash
./gradlew test -DdeviceHost=emulation

JAVA_HOME=$(/usr/libexec/java_home -v 17) \
./gradlew clean mobile_test -DdeviceHost=emulation

```
если хотим изменить параметры запуска

```bash
./gradlew clean test \
  -Ddevice.name=Nexus_5X \
  -Dplatform.name=Android \
  -Dapp.package=org.wikipedia
```

### ▶ 1. Реальное устройство (USB, PROD Wikipedia)
```bash
./gradlew test -DdeviceHost=real
```