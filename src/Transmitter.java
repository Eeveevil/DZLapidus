public interface Transmitter<T> {
    String getTo();
    String getFrom();
    T getContent();
}
