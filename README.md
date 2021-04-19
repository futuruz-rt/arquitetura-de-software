Projeto para disciplina de Arquitetura do Software do curso de Engenharia de Software da UTFPR - CP. Parte do código foi retirado do Gabriel Costa Silva, disponível no link: https://github.com/gabrielcostasilva/sa-soilcorrection
-----------------------------
<pre>
Uso da ferramenta cloc para realização da contagem de linhas de código, vale ressaltar que os testes não foram incluídos.
./cloc arquitetura-de-software          
      10 text files.
      10 unique files.                              
       1 file ignored.

github.com/AlDanial/cloc v 1.89  T=0.02 s (517.8 files/s, 24235.0 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             8             72              1            361
Maven                            1              0              0             33
Markdown                         1              0              0              1
-------------------------------------------------------------------------------
SUM:                            10             72              1            395
-------------------------------------------------------------------------------
</pre>

<pre>
Atividade 3
Redução de 26 linhas de código, remoção de condicionais e variável auxiliar utilizada de forma errônea
- Remoção da variável auxiliar declarada várias vezes no código (https://github.com/futuruz-rt/arquitetura-de-software/commit/98bae6c9c7e48b3a6b55947af4e1681b87d8b56a)
- Remoção do switch que atribuia valores, a partir de agora é atribuído direto na classe enum (https://github.com/futuruz-rt/arquitetura-de-software/commit/a4d40c31d7a199f19b9e90919fec7e82775c5764 e https://github.com/futuruz-rt/arquitetura-de-software/commit/04f03b66b4c0295857b6855a0629848f506069a3)

# ./cloc arquitetura-de-software 
      10 text files.
      10 unique files.                              
       1 file ignored.

github.com/AlDanial/cloc v 1.89  T=0.06 s (158.6 files/s, 7357.4 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             8             73              1            335
Maven                            1              0              0             33
Markdown                         1              3              0             19
-------------------------------------------------------------------------------
SUM:                            10             76              1            387
-------------------------------------------------------------------------------

</pre>
