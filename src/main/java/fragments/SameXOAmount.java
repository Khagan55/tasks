package fragments;

class SameXOAmount {
    public boolean sameXOAmount(String text) {
        long countOfX = text.toLowerCase().chars().filter(ch->ch == 'x').count();
        long countOfO = text.toLowerCase().chars().filter(ch->ch == 'o').count();

        return countOfX == countOfO;
    }
}