package chapter6;

/**
 * Created by wangzhenhua on 16/5/15.
 */
public enum  Phase {
    SOLID,
    LIQUID,
    GAS;
    public enum Transition {
        MELT,
        FREEZE,
        BOIL,
        CONDENSE,
        SUBLIME,
        DEPOSIT;
        //rows indexed by src-ordinal, cols by des-ordinal
        private static final Transition[][] TRANSITIONS = {
            { null, MELT, SUBLIME },
            { FREEZE, null, BOIL },
            { DEPOSIT, CONDENSE, null}
        };

        public static Transition from(Phase src , Phase dst){
            return TRANSITIONS[src.ordinal()][dst.ordinal()];
        }

    }

    public static void main(String[] args) {
       System.out.println( Phase.Transition.from(Phase.GAS,Phase.LIQUID) );
    }
}
