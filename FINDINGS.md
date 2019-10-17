# JsonObject Performance

./run deser --apis databind --libs jackson_orgjson,gson_jsonobject,javaxjson_jsonobject --size 1000
```
Benchmark                              Mode  Cnt    Score    Error  Units
Deserialization.gson_jsonobject       thrpt   20  483.666 ± 15.192  ops/s
Deserialization.jackson_orgjson       thrpt   20  732.920 ± 19.206  ops/s
Deserialization.javaxjson_jsonobject  thrpt   20  444.785 ± 10.464  ops/s
```

./run deser --apis databind --libs jackson_orgjson,gson_jsonobject,javaxjson_jsonobject
```
Benchmark                              Mode  Cnt       Score       Error  Units
Deserialization.gson_jsonobject       thrpt   20  499492.491 ± 16635.273  ops/s
Deserialization.jackson_orgjson       thrpt   20  760920.621 ± 28405.341  ops/s
Deserialization.javaxjson_jsonobject  thrpt   20  492379.245 ± 18934.384  ops/s
```