package java8.groupingby.exe;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Trade {

    private String tradeId;
    private String trader;
    private double notional;
    private String currency;
    private String region;

    public String getTradeId() {
        return tradeId;
    }

    public String getTrader() {
        return trader;
    }

    public double getNotional() {
        return notional;
    }

    public String getCurrency() {
        return currency;
    }

    public String getRegion() {
        return region;
    }

    public Trade(String tradeId, String trader, double notional, String currency, String region) {
        this.tradeId = tradeId;
        this.trader = trader;
        this.notional = notional;
        this.currency = currency;
        this.region = region;
    }
    public String toString() {
        return tradeId + " " + trader + " " + notional + " " + currency + " " + region;
    }
    public static void main(String[] args) {
        List<Trade> trades = Arrays.asList(
                new Trade("T1001", "John", 540000, "USD", "NA"),
                new Trade("T1002", "Mark", 10000, "SGD", "APAC"),
                new Trade("T1003", "David", 120000, "USD", "NA"),
                new Trade("T1004", "Peter", 4000, "USD", "NA"),
                new Trade("T1005", "Mark", 300000, "SGD", "APAC"),
                new Trade("T1006", "Mark", 25000, "CAD", "NA"),
                new Trade("T1007", "Lizza", 285000, "EUR", "EMEA"),
                new Trade("T1008", "Maria", 89000, "JPY", "EMEA"),
                new Trade("T1009", "Sanit", 1000000, "INR", "APAC")
        );
//        Map<String,List<Trade>> getCountryRegion =trades.stream().collect(Collectors.groupingBy(Trade::getRegion));
//        System.out.println(getCountryRegion);

//        Map<String, Map<String, List<Trade>>> map2 = trades.stream()
//                .collect(Collectors.groupingBy(Trade::getRegion,
//                        Collectors.groupingBy(Trade::getCurrency)));
//        System.out.println(map2);

//       Map<String,Long>groupByRegion = trades.stream().collect(Collectors.groupingBy(Trade::getRegion, Collectors.counting()));
//       System.out.println(groupByRegion);


//        Map<Boolean, List<String>> partitionedIds = trades.stream()
//                .collect(Collectors.partitioningBy(
//                        t -> "USD".equals(t.getCurrency()),
//                        Collectors.mapping(Trade::getTradeId, Collectors.toList())
//                ));
//
//        System.out.println(partitionedIds);

//        Map<String, DoubleSummaryStatistics> map = trades.stream()
//                .collect(Collectors.groupingBy(Trade::getRegion,
//                        Collectors.summarizingDouble(Trade::getNotional)));
//
//        DoubleSummaryStatistics naData = map.get("NA");
//        System.out.printf("No of deals: %d\nLargest deal: %f\nAverage deal cost: %f\nTotal traded amt: %f",
//                naData.getCount(), naData.getMax(), naData.getAverage(), naData.getSum());

//        Map<String, Optional<Trade>> map1 = trades.stream()
//                .collect(groupingBy(Trade::getRegion, maxBy(comparing(Trade::getNotional))));
//
//            System.out.println(map1);

//        Map<String, Trade> map2 = trades.stream()
//                .collect(groupingBy(Trade::getRegion,
//                        collectingAndThen(maxBy(comparing(Trade::getNotional)), Optional::get)));
//        System.out.println(map2);
        Map<String, Set<String>> map = trades.stream()
                .collect(groupingBy(Trade::getRegion, mapping(Trade::getTradeId, toSet())));
        System.out.println(map);
    }
}