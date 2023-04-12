public class Cylinder extends Circle {

        private double chieucao;

        public double getChieucao() {
            return chieucao;
        }

        public void setChieucao(double chieucao) {
            this.chieucao = chieucao;
        }

        public Cylinder(){
            this.toaDoX = 0.0;
            this.toaDoY = 0.0;
            this.radius = 1;
            this.color = "red";
            this.chieucao = 1;
        }


        public Cylinder(double toaDoX, double toaDoY, double radius, String color, double chieucao) {
            super(toaDoX, toaDoY, radius, color);
            this.chieucao = chieucao;
        }

        @Override
        public String toString() {
            return "Cylinder{" +
                    "chieucao=" + chieucao +
                    ", toaDoX=" + toaDoX +
                    ", toaDoY=" + toaDoY +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

        public double tinhTheTich(){
            double theTich = (this.radius * this.radius * 3.14) * this.chieucao;
            return theTich;
        }
    }

