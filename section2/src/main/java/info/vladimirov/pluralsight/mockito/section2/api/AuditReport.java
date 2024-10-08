package info.vladimirov.pluralsight.mockito.section2.api;

public interface AuditReport {

  void reportTrade(String message, int qty, double price);

  void reportFailedTrade(String message, int qty, double price);
}
