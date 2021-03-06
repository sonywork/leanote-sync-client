package net.g3tit.leanote.client.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.ZonedDateTime

/**
 * @author zhixiao.mzx
 * @date 2019/03/08
 */
data class LeanoteNote(
    @JsonProperty("NoteId") var noteId: String,
    @JsonProperty("NotebookId") var notebookId: String,
    @JsonProperty("Title") var title: String,
    @JsonProperty("Content") var content: String,
    @JsonProperty("Usn") var updateSequenceNum: Long,
    @JsonProperty("UpdatedTime") var updatedTime: ZonedDateTime,
    @JsonProperty("IsMarkdown") var isMarkdown: Boolean,
    @JsonProperty("IsDeleted") var isDeleted: Boolean,
    @JsonProperty("IsTrash") var isTrash: Boolean
)
