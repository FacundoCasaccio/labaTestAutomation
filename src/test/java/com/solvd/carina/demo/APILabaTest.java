package com.solvd.carina.demo;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.APIMethodPoller;
import com.solvd.carina.demo.api.GetAlbumMethod;
import com.solvd.carina.demo.api.PatchAlbumMethod;
import com.solvd.carina.demo.api.PostAlbumMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class APILabaTest implements IAbstractTest {

    @Test
    public void getAlbumTest() {
        GetAlbumMethod getAlbumMethod = new GetAlbumMethod();
        getAlbumMethod.callAPIExpectSuccess();
        getAlbumMethod.validateResponseAgainstSchema("api/albums/_get/rs.schema");
    }

    @Test
    public void postAlbumTest() {

        PostAlbumMethod api = new PostAlbumMethod();
        api.setProperties("api/albums/album.properties");

        AtomicInteger counter = new AtomicInteger(0);

        api.callAPIWithRetry()
                .withLogStrategy(APIMethodPoller.LogStrategy.ALL)
                .peek(rs -> counter.getAndIncrement())
                .until(rs -> counter.get() == 4)
                .pollEvery(1, ChronoUnit.SECONDS)
                .stopAfter(10, ChronoUnit.SECONDS)
                .execute();
        api.validateResponse();
    }

    @Test
    public void patchAlbumTest() {

        PatchAlbumMethod api = new PatchAlbumMethod();
        api.setProperties("api/albums/album.properties");

        api.callAPIExpectSuccess();
        api.validateResponse();
    }
}

