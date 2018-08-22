package EX_01;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    private int ano;
    private int mes;
    private int dia;

    public Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public Data() {
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }


    public void adicionaDias(int dia) {
        Date date = new Date();
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(getAno(), getMes(), getDia());

        int lastDayMonth = cal.getActualMaximum(cal.DAY_OF_MONTH);
        int lastMonth = cal.getActualMaximum(cal.MONTH) + 1;
        int firstMonth = cal.getActualMinimum(cal.MONTH);

        if (this.mes >= lastMonth) {
            this.mes = firstMonth;
            this.ano++;
        }

        int intervalDays = 0;

        int totalDay = this.dia + dia;

        if (totalDay > lastDayMonth) {
            intervalDays = totalDay - lastDayMonth;
            this.mes++;
            this.dia = 0 + intervalDays;
        } else {
            this.dia += dia;
        }
    }


    public int diasNoMes() {
        int daysInMonth = 0;
        try {
            YearMonth yearMonthObject = YearMonth.of(getAno(), getMes());
            daysInMonth = yearMonthObject.lengthOfMonth();
            return daysInMonth;
        } catch (Exception e) {
            String invalidMonth = "Mês inválido";
            return Integer.parseInt(invalidMonth);
        }

    }


    public String diaDaSemana() {
        Calendar cal = new GregorianCalendar(getAno(), getMes() - 1, getDia());
        int diaSemana = cal.get(cal.DAY_OF_WEEK);
        int lastDayMonth = cal.getActualMaximum(cal.DAY_OF_MONTH);

        if (lastDayMonth < getDia()) {
            int intervalDays = getDia() - lastDayMonth;
            this.mes++;
            this.dia = intervalDays;
        }

        String _diaSemana = null;

        switch (diaSemana) {

            case 1: {
                _diaSemana = "Domingo";
                break;
            }
            case 2: {
                _diaSemana = "Segunda-feira";
                break;
            }
            case 3: {
                _diaSemana = "Terça-feira";
                break;
            }
            case 4: {
                _diaSemana = "Quarta-feira";
                break;
            }
            case 5: {
                _diaSemana = "Quinta-feira";
                break;
            }
            case 6: {
                _diaSemana = "Sexta-feira";
                break;
            }
            case 7: {
                _diaSemana = "Sábado";
                break;
            }

        }
        return _diaSemana;

    }

    public boolean eAnoBisexto() {
        if (((getAno() % 4 == 0) || (getAno() % 4 == 0)) && (getAno() % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void proximoDia() {
        Date date = new Date();
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(getAno(), getMes(), getDia());

        int lastDayMonth = cal.getActualMaximum(cal.DAY_OF_MONTH);
        int intervalDays = 0;

        if (getDia() >= lastDayMonth) {
            intervalDays = getDia() - lastDayMonth;
            this.mes++;
            this.dia = 0 + intervalDays;
        }
        this.dia++;

    }
}

