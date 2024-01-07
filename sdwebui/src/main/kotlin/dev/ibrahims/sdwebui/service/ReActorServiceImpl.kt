package dev.ibrahims.sdwebui.service

import dev.ibrahims.sdwebui.response.ReActorModelsResponse
import dev.ibrahims.sdwebui.response.ReActorUpscalersResponse
import io.ktor.client.*

class ReActorServiceImpl(
    override val baseUrl: String,
    override val client: HttpClient,
) : Service(), ReActorService {

    override suspend fun getModels(): Result<ReActorModelsResponse> {
        return getRequest("reactor/models")
    }

    override suspend fun getUpscalers(): Result<ReActorUpscalersResponse> {
        return getRequest("reactor/upscalers")
    }
}