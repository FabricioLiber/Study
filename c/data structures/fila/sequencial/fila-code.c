#include "FilaSequencial.h"
#define MAX 6

void criarFila (tFila *f) {
  f->inicio = 0;
  f->fim = -1;
  f->tam = 0;
}
int vaziaFila (tFila f) {
  return (f.tam == 0);
}
int primeiro (tFila f, telem *dado) {
  if (vaziaFila(f))
    return 0;
  *dado = f.vetor[f.inicio];
  return 1;
}
int inserir (tFila *f, telem dado){
  if (f->tam == MAX)
    return 0;
  (f->tam) ++;
  f->final = (f->final + 1) % MAX;
  f->vetor[f->final] = dado;
  return 1;
}
int remover (tFila *f, telem *dado) {
  if (vaziaFila(*f))
    return 0;
  primeiro(*f, dado);
  (f->tam) --;
  f->inicio = (f->inicio - 1) % MAX;
  return 1;
}
