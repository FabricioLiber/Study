typedef int telem;

typedef struct no {
    telem dado;
    struct no prox;
} tno;

typedef struct fila {
  tno *inicio;
  tno *fim;
} tFila;

void criarFila (tFila *f);
int vaziaFila (tFila f);
int primeiro (tFila f, telem *dado);
int inserir (tFila *f, telem dado);
int remover (tFila *f, telem *dado);
