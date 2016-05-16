package chapter6;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by wangzhenhua on 16/5/15.
 */
public enum  PhaseImprovement {

    SOLID,
    LIQUID,
    GAS;

    public enum Transition {
        MELT(SOLID,LIQUID),
        FREEZE(LIQUID,SOLID),
        BOIL(LIQUID,GAS),
        CONDENSE(GAS,LIQUID),
        SUBLIME(SOLID,GAS),
        DEPOSIT(GAS,SOLID);

        private final PhaseImprovement src;
        private final PhaseImprovement dst;

        Transition(PhaseImprovement src,PhaseImprovement dst){
            this.src = src;
            this.dst = dst;
        }

        private static final Map<PhaseImprovement,Map<PhaseImprovement,Transition>> m =
                new EnumMap<PhaseImprovement,Map<PhaseImprovement,Transition>>(PhaseImprovement.class);

        static {
            for (PhaseImprovement p : PhaseImprovement.values())
                m.put(p,new EnumMap<PhaseImprovement,Transition>(PhaseImprovement.class));
            for (Transition trans : Transition.values())
                m.get(trans.src).put(trans.src,trans);
        }
        public static Transition from(PhaseImprovement src,PhaseImprovement dst){
            return m.get(src).get(dst);
        }

    }




    public static void main(String[] args) {
        System.out.println(PhaseImprovement.Transition.from(PhaseImprovement.SOLID,PhaseImprovement.LIQUID));

    }

}
