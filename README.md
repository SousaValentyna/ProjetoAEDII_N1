## Introdução

Bem-vindo ao mundo Java no VS Code. Este guia ajudará você a configurar e estruturar seu projeto Java de maneira eficiente no Visual Studio Code.

## Estrutura de Pastas

O workspace contém as seguintes pastas:

- `src`: A pasta principal do código-fonte, contendo os seguintes subdiretórios:
  - `model`: Contém classes de modelo de dados, como `Aluno.java`, `Disciplina.java` e `Curso.java`.
  - `service`: Contém classes de lógica e processamento.
  - `util`: Contém classes utilitárias, como `FileReaderUtil.java` e `FileWriterUtil.java` para operações com arquivos.
  - `main`: Contém o arquivo `Main.java`, que é o ponto de entrada do programa.
- `data`: Armazena arquivos de entrada (`Alunos.txt`, `Disciplinas.txt`, `Cursos.txt`) e arquivos de saída gerados pelo programa.
- `bin`: Pasta onde os arquivos compilados serão gerados por padrão.
- `lib`: Pasta para armazenar dependências, se houver.

> Se desejar personalizar a estrutura de pastas, abra `.vscode/settings.json` e atualize as configurações relacionadas.

## Gerenciamento de Dependências

A visão `JAVA PROJECTS` no VS Code permite gerenciar suas dependências facilmente. Mais detalhes podem ser encontrados [aqui](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Executando o Projeto

Para executar o projeto no VS Code:

1. Abra o terminal e navegue até a pasta do projeto.
2. Compile o projeto usando:
   ```sh
   javac -d bin src/main/Main.java
   ```
3. Execute o programa compilado usando:
   ```sh
   java -cp bin main.Main
   ```

Alternativamente, você pode usar o botão **Executar** no VS Code abrindo `Main.java` e clicando em `Run`.

