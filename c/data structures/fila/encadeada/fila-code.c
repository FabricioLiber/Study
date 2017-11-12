#include "FilaEncadeada.h"

void criarFila (tFila *f) {
  f->inicio= f->fim = NULL;
}
int vaziaFila (tFila f) {
  return (f.inicio = NULL && f.fim = NULL);
}
int primeiro (tFila f, telem *dado){
  if (vaziaFila(f))
    return 0;
  *dado = (f.inicio)->dado;
  return 1;
}
int inserir (tFila *f, telem dado) {
  tno *novo;
  if ((novo = (tno*) malloc(sizeof(tno))) == NULL)
    return 0;
  novo->dado = dado;
  novo->prox = NULL;
  if(vaziaFila(*f))
    f->inicio = novo;
  else
    (f->final)->prox = novo;
  f->final = novo;
}
int remover (tFila *f, telem *dado) {
  tno *aux;
  if(vaziaFila(*f))
    return 0;
  primeiro (*f, dado);
  if (f->inicio == f->final)
    f->final = NULL;
  aux = f->inicio;
  f->inicio = (f->inicio)->prox;
  free(aux);
}
