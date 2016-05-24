#include <stdio.h>

//Aluno Marcos Mello Wermelinger Bittencourt

int main()
{
    
    struct ordem
    {
        char nome[19];
        float nota;
    };

    struct ordem aluno[30];
    struct ordem nota2;
    int i, j;
    
    for(i=0;i<30;i++)
    {
        printf("nome do aluno %d:", i+1);
        scanf("%s", aluno[i].nome);
        do
        {
            printf("quanto %s tirou na av1?:\n", aluno[i].nome);
            scanf("%f", &aluno[i].nota);
            if(aluno[i].nota>10||aluno[i].nota<0)
            printf("valor invalido!\n");
        }while(aluno[i].nota>10||aluno[i].nota<0);
    }
    
    for(i=0;i<30;i++)
    {
        for(j=i;j<30;j++)
        {
            if(aluno[i].nota<aluno[j].nota)
            {
                nota2=aluno[i];
                aluno[i]=aluno[j];
                aluno[j]=nota2;
            }
        }
    }
    printf("Listagem da AV1\n");
    printf("---------------------------------------------------\n");
    printf("Nome:\t \t \tNota:\n");
    for(i=0;i<30;i++)
    {
        printf("%s\t \t \t%.2f\n", aluno[i].nome, aluno[i].nota);
    }
    printf("---------------------------------------------------\n");
    
return 0;
}
