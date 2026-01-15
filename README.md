
# Проект по автоматизации тестирования <a href="https://www.flip.kz/">flip.kz</a> <a href="https://www.flip.kz/"><img src="images/logo/fliplogo.png" alt="Flip.kz" height="30" style="position: relative; top: 6px; margin-left: 6px;"></a>

> Flip.kz — крупный казахстанский интернет-магазин с широким ассортиментом товаров: от книг, электроники и косметики до товаров для дома, канцелярии и детских товаров.
> Платформа известна собственной быстрой доставкой, удобным мобильным приложением и выгодными предложениями по акциям и бонусной программе.
> Flip обеспечивает простой поиск, подробные описания товаров и удобный процесс заказа, что делает его одним из самых популярных маркетплейсов в Казахстане.
---

## Содержание:
---

- [Технологии и инструменты](#технологии-и-инструменты)
- [Примеры автоматизированных тест-кейсов](#примеры-автоматизированных-тест-кейсов)
- [Сборка в Jenkins](#параметры-сборки-в-jenkins)
- [Запуск из терминала](#запуск-из-терминала)
- [Allure отчет](#allure-отчет)
- [Интеграция с Allure TestOps ](#интеграция-с-allure-testops)
- [Уведомление в Telegram при помощи бота](#уведомление-в-telegram-при-помощи-бота)
- [Видео примера запуска тестов в Selenoid](#видео-примера-запуска-тестов-в-selenoid)
---

## Технологии и инструменты:
---
<p>
  <a href="https://www.java.com/"><img src="images/logo/Java.svg" height="48" alt="Java"/></a> 
  <a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" height="48" alt="IDEA"/></a> 
  <a href="https://github.com/"><img src="images/logo/Github.svg" height="48" alt="Github"/></a> 
  <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" height="48" alt="Gradle"/></a> 
  <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" height="48" alt="Allure"/></a> 
  <a href="https://qameta.io/"><img src="images/logo/Allure2.svg" height="48" alt="Allure TestOps"/></a>  
  <a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" height="48" alt="Jenkins"/></a>  
  <a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" height="48"  alt="JUnit 5"/></a>  
  <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" height="48"  alt="Selenide"/></a> 
  <a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" height="48" alt="Selenoid"/></a> 
  <a href="https://web.telegram.org/k/"><img src="images/logo/Telegram.svg" height="48" alt="Telegram"/></a> 
  <a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" height="48" alt="Jira"/></a>  
</p>

---

## Примеры автоматизированных тест-кейсов:

- ✓ Проверка работы поиска
- ✓ По клику на 'KZ' сайт переводится на казахский язык
- ✓ Проверка добавление в корзину
- ✓ Проверка каунтера корзины
- ✓ Прооверка пунктов самовывоза
- ✓ Прооверка элементов интерфейса на главной

---

## 🔧 Сборка в [Jenkins](https://jenkins.autotests.cloud/job/38-alexandrachirkova-final-e2e-test/)
<p align="center">
<img src="images/screenshots/Jenkins.png" />
</p>

---

## Параметры сборки в Jenkins
- **browser** — браузер (по умолчанию: `chrome`)
- **browserVersion** — версия браузера (по умолчанию: `128.0`)
- **browserSize** — размер окна браузера (по умолчанию: `1920x1080`)
- **remoteUrl** — логин/пароль + адрес удалённого Selenoid

---

## Запуск из терминала

<h3>Локальный запуск:</h3>

<div style="background:#f6f8fa; padding:16px; border-radius:6px;">
<pre>
gradle clean demoqa_test
</pre>
</div>

<h3>Удалённый запуск через Jenkins:</h3>

<div style="background:#f6f8fa; padding:16px; border-radius:6px;">
<pre>
clean demoqa_test
"-Dbrowser=${BROWSER} "
"-DbrowserVersion=${BROWSER_VERSION}"
"-DbrowserSize=${BROWSER_SIZE}"
"-Dremote=https://user1:1234@${REMOTE}/wd/hub"
</pre>
</div>

## ✅ ОСНОВНЫЕ КОМАНДЫ ЗАПУСКА мобильных тестов

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

### ▶ 2. Реальное устройство (USB, PROD Wikipedia)
```bash
./gradlew test -DdeviceHost=real
`
```
---

## [Allure отчет](https://jenkins.autotests.cloud/job/38-alexandrachirkova-final-e2e-test/5/allure/)
---
<p align="center">
<img src="images/screenshots/allure2.png"  />
<img src="images/screenshots/allure1.png"  />
</p>

---

## Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/5013/dashboards)
---
<p align="center">
<img src="images/screenshots/allureTestOps.png" />
</p>

---

## Уведомление в Telegram при помощи бота

---
<p align="center">
<img src="images/screenshots/telegramBot.png" />
</p>

---

## Видео примера запуска тестов в Selenoid

В отчетах Allure для каждого теста прикреплен не только скриншот, но и видео прохождения теста
<p align="center">
  <img title="Selenoid Video" src="images/screenshots/demovid.gif">
</p>

---




