# DevOps3
Проект состоит из двух SpringBoot-сервисов:
- **source-server**, возвращающий информацию по HTTP-запросу;
- **client-server**, обращающийся к _source-server_ за информацией.



Для сборки/пересборки проекта при изменении кода использовать команду: 
`mvn package`, которая автоматически сохранит jar-ники в _build_. Должен быть установлен Maven и JDK 21.

Создание образов Docker по отдельности:\
`docker build -t source -f sourceserver\Dockerfile .`\
`docker build -t client -f clientserver\Dockerfile .`

Поднятие всех образов сразу:\
`docker compose build`\
`docker compose up`

Для тестирования работы и успешности связи двух контейнеров достаточно послать GET-запрос по адресу:
http://127.0.0.1:8081/
