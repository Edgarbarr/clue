package com.backenders.clue;

public enum RoomExit {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5);

        private final int value;

        private RoomExits(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
}

