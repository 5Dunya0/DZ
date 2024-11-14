# DevOps3
Проект состоит из двух SpringBoot-сервисов:
- **source-server**, возвращающий информацию по HTTP-запросу;
- **client-server**, обращающийся с _source-server_ за информацией.

jar-файлы с двумя сервисами лежат в папке **build** (~~точнее, лежали бы, но по заданию нельзя отправлять jar~~).

Для сборки/пересборки проекта при изменении кода использовать команду: 
`mvn package`, которая автоматически сохранит jar-ники в _build_.

Создание образов Docker по отдельности:\
`docker build -t source -f sourceserver\Dockerfile .`\
`docker build -t client -f clientserver\Dockerfile .`

Поднятие всех образов сразу:\
`docker compose build`\
`docker compose up`

Для тестирования работы и успешной связи двух контейнеров достаточно послать GET-запрос по адресу:
http://127.0.0.1:8081/