package song.sam.cozytrain.data.healthconnect.types

import androidx.health.connect.client.records.Record
import androidx.health.connect.client.records.SleepSessionRecord
import androidx.health.connect.client.records.SleepStageRecord
import androidx.health.connect.client.records.metadata.Metadata
import java.time.Duration
import java.time.Instant
import java.time.ZoneOffset

/**
 * Represents sleep data, raw, aggregated and sleep stages, for a given [SleepSessionRecord].
 */
data class SleepSessionData(
    val uid: String,
    val startTime: Instant,
    val startZoneOffset: ZoneOffset?,
    val endTime: Instant,
    val endZoneOffset: ZoneOffset?,
    val duration: Duration?,
    val stages: List<SleepStageRecord> = listOf(),
    override val metadata: Metadata = Metadata()

) : Record {
    override fun toString(): String {
        return "SleepSessionData(uid='$uid', startTime=$startTime, startZoneOffset=$startZoneOffset, endTime=$endTime, endZoneOffset=$endZoneOffset, duration=$duration, stages=$stages, metadata=$metadata)"
    }
}
