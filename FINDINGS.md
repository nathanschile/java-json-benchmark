./run deser --apis databind --libs jackson_orgjson,jackson,gson_jsonobject --size 1000
```text
Benchmark                             Mode  Cnt    Score    Error  Units
Deserialization.gson_jsonobject      thrpt   20  533.205 ± 21.151  ops/s
Deserialization.jackson              thrpt   20  911.469 ± 28.130  ops/s
Deserialization.jackson_afterburner  thrpt   20  975.924 ± 23.809  ops/s
Deserialization.jackson_orgjson      thrpt   20  757.947 ± 27.421  ops/s
```
./run deser --apis databind --libs jackson_orgjson,jackson,gson_jsonobject
```
Benchmark                             Mode  Cnt       Score       Error  Units
Deserialization.gson_jsonobject      thrpt   20  525167.403 ± 17376.934  ops/s
Deserialization.jackson              thrpt   20  693303.446 ± 83344.498  ops/s
Deserialization.jackson_afterburner  thrpt   20  803506.938 ± 43537.199  ops/s
Deserialization.jackson_orgjson      thrpt   20  693364.776 ± 83671.510  ops/s
```