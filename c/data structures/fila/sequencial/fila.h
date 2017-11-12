#define MAX 6

typedef int telem;

typedef struct no {
  telem vetor[MAX];
  int inicio;
  int fim;
  int tam;
} tno;

typedef tno *tFila;

void criarFila (tFila *f);
int vaziaFila (tFila f);
int primeiro (tFila f, telem *dado);
int inserir (tFila *f, telem dado);
int remover (tFila *f, telem *dado);
