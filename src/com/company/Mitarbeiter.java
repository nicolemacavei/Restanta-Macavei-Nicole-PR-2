package com.company;

public class Mitarbeiter {
        private String name;
        private int lohn;

        public Mitarbeiter(String name, int lohn) {
            this.name = name;
            this.lohn = lohn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLohn() {
            return lohn;
        }

        public void setLohn(int lohn) {
            this.lohn = lohn;
        }

        @Override
        public String toString() {
            return "Mitarbeiter{" +
                    "name='" + name + '\'' +
                    ", lohn=" + lohn +
                    '}';
        }
}
