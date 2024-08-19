# CitelDemo


Como subir o projeto?

BACKEND SPRING BOOT

Baixe o DockerDesktop 

Na pasta onde contem o projeto demo (backend) contém um docker-compose que irá subir um container do MYSQL DB 

Abra o terminal (git bash de preferencia) na pasta onde contém o docker compose e execute os comandos:
docker-compose up -d     ----> Para subir a imagem docker
docker exec -it my-mysql bash   -----> Para entrar no container docker (Caso estiver usando windows pode ser que precise do winpty ficando desta maneira 'winpty docker exec -it my-mysql bash')
mysql -u root -p -----> senha mysqlPW (como está configurado no docker compose) para entrar no mysql e rodar querys
update mysql.user set host='%' where user='root'; ------> Alteração da conexão do banco, isso é importante se não o backend não irá enxergar o banco de dados
FLUSH PRIVILEGES;  -------> Dê um flush nos privilégios 

Pronto! o Banco está pronto para ser usado se precisar rode docker restart my-mysql


Agora import o projeto MAVEN dê um maven clean install (Lembrando que o projeto está na pasta DEMO junto com o docker-compose)
Execute o DemoApplication 
Acesse o Swagger da aplicação 

http://localhost:8080/swagger-ui/index.html#

Use o endpoint /api/cadastro/informacao e coloque o conteudo do data.json da exemplo, o endpoint irá cadastrar todas as pessoas no banco de dados 

Pronto! poderá utilizar todos os endpoints de estatistica.



FRONTEND

Na pasta front contém a pasta CITELTESTE que é onde está o projeto ANGULAR 17

Abra com VSCODE e abra um terminal e execute:

npm install  ------> instalar todas as dependencias do angular
npm start --------> para executar o front end 

Pronto! agora é só navegar! 

Obrigado!
