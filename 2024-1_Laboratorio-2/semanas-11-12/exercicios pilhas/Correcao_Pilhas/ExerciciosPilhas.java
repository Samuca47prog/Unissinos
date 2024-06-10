public class ExerciciosPilhas<E> {
    public Integer[] itemsExcept(int number, Stack<Integer> p) {
        Integer[] retorno = new Integer[p.numElements()];
        int i=0; //contador para o array de retorno

        Stack<Integer> aux = new StaticStack<>(p.numElements());

        while(!p.isEmpty()) {
            int elemento = p.pop();
            if(elemento != number)
                retorno[i++] = elemento;
            aux.push(elemento);
        }

        while(!aux.isEmpty())
            p.push(aux.pop());

        return retorno;
    }

    public void transferElements(Stack<E> s1, Stack<E> s2) {
        StaticStack<E> saux = new StaticStack<>(s1.numElements());

        while(!s1.isEmpty())
            saux.push(s1.pop());

        while(!saux.isEmpty())
            s2.push(saux.pop());

        //Apenas para testar
        while(!s2.isEmpty())
            System.out.print(s2.pop() + " ");
        System.out.println();
    }

    public void prependStack(Stack<Integer> p1, Stack<Integer> p2) throws OverflowException{
        Stack<Integer> auxP1 = new StaticStack<>(p1.numElements());
        Stack<Integer> auxP2 = new StaticStack<>(p2.numElements());

        while(!p1.isEmpty())
            auxP1.push(p1.pop());

        while(!p2.isEmpty())
            auxP2.push(p2.pop());

        while(!auxP2.isEmpty())
            p1.push(auxP2.pop());

        while(!auxP1.isEmpty())
            p1.push(auxP1.pop());
    }

    public void findElement(Stack<E> s, E element) throws UnderflowException {
        if(s.isEmpty())
            throw new UnderflowException();

        Stack<E> saux = new StaticStack<E>(s.numElements());

        int p = s.numElements() - 1;
        while(!s.isEmpty()) {
            E eAux = s.top();
            if(eAux.equals(element))
                break;
            else {
                saux.push(s.pop());
                --p;
            }
        }

        while(!saux.isEmpty())
            s.push(saux.pop());

        if(p > -1)
            System.out.println("Elemento encontrado na posição: " + p);
        else
            System.out.println("Elemento não encontrado");
    }

}
