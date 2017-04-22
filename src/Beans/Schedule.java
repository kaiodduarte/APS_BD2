package Beans;

import java.util.LinkedList;
import java.util.Random;

public class Schedule {

    private LinkedList<Operacao> scheduleInList;

    public Schedule(LinkedList<Transacao> transacoes) {
        scheduleInList = new LinkedList<>();
        ligaOperacoes(transacoes);
    }

    private void ligaOperacoes(LinkedList<Transacao> transacoes) {
        Random r = new Random();
        int n;

        while (!transacoes.isEmpty()) {
            n = r.nextInt(transacoes.size());
            if (!transacoes.get(n).transIsEmpty()) {
                scheduleInList.add(transacoes.get(n).getFirstOp());
                transacoes.get(n).removeOp();
            } else {
                transacoes.remove(n);
            }
        }
    }

    public LinkedList<Operacao> getScheduleInList() {
        return scheduleInList;
    }

    public void setScheduleInList(LinkedList<Operacao> scheduleInList) {
        this.scheduleInList = scheduleInList;
    }

    public void addRetorno(LinkedList<Operacao> retorno) {
        retorno.addAll(this.getScheduleInList());
        this.scheduleInList = new LinkedList<Operacao>();
        this.scheduleInList.addAll(retorno);
    }
;

}
