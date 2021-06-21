package homework.oop;

public enum Operations {
    ADDITION {
        @Override
        public String toString() {
            return "addition";
        }
    },
    SUBTRACTION {
        @Override
        public String toString() {
            return "subtraction";
        }
    },
    MULTIPLICATION {
        @Override
        public String toString() {
            return "multiplication";
        }
    },
    DIVIDE {
        @Override
        public String toString() {
            return "divide";
        }
    },
    SQUARE_ROOT {
        @Override
        public String toString() {
            return "square root";
        }
    },
    FACTORIAL {
        @Override
        public String toString() {
            return "factorial";
        }
    },
    SIN {
        @Override
        public String toString() {
            return "sin";
        }
    },
    COS {
        @Override
        public String toString() {
            return "cos";
        }
    },
    TAN {
        @Override
        public String toString() {
            return "tan";
        }
    },
    LOG {
        @Override
        public String toString() {
            return "logarithm";
        }
    },
    EXP {
        @Override
        public String toString() {
            return "exp";
        }
    }

}
