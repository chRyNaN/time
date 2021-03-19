//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[DateTimeLongSerializer](index.md)



# DateTimeLongSerializer  
 [common] object [DateTimeLongSerializer](index.md) : KSerializer<[DateTimeLong](../-date-time-long/index.md)> 

A KSerializer for [DateTimeLong](../-date-time-long/index.md). This handles serializing to and from a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) value, that represents milliseconds since the UTC Epoch, and a [DateTimeLong](../-date-time-long/index.md).

   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.time/DateTimeLongSerializer///PointingToDeclaration/"></a>[com.chrynan.time.DateTimeLong](../-date-time-long/index.md)| <a name="com.chrynan.time/DateTimeLongSerializer///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/DateTimeLongSerializer/deserialize/#kotlinx.serialization.encoding.Decoder/PointingToDeclaration/"></a>[deserialize](deserialize.md)| <a name="com.chrynan.time/DateTimeLongSerializer/deserialize/#kotlinx.serialization.encoding.Decoder/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [DateTimeLong](../-date-time-long/index.md)  <br><br><br>|
| <a name="com.chrynan.time/DateTimeLongSerializer/serialize/#kotlinx.serialization.encoding.Encoder#com.chrynan.time.DateTimeLong/PointingToDeclaration/"></a>[serialize](serialize.md)| <a name="com.chrynan.time/DateTimeLongSerializer/serialize/#kotlinx.serialization.encoding.Encoder#com.chrynan.time.DateTimeLong/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [DateTimeLong](../-date-time-long/index.md))  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/DateTimeLongSerializer/descriptor/#/PointingToDeclaration/"></a>[descriptor](descriptor.md)| <a name="com.chrynan.time/DateTimeLongSerializer/descriptor/#/PointingToDeclaration/"></a> [common] open override val [descriptor](descriptor.md): SerialDescriptor   <br>|

