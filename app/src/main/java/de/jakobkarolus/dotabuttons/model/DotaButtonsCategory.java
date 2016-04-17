package de.jakobkarolus.dotabuttons.model;

import java.util.List;
import java.util.Map;

/**
 * A category/view of DotaButtons<br>
 * Includes a map of responses and their count for easy access
 *
 * Created by jakob on 17.04.2016.
 */
public class DotaButtonsCategory {

    private long count;
    private Map<Heroes, List<HeroResponse>> responses;


    public DotaButtonsCategory(long count, Map<Heroes, List<HeroResponse>> responses) {
        this.count = count;
        this.responses = responses;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Map<Heroes, List<HeroResponse>> getResponses() {
        return responses;
    }

    public void setResponses(Map<Heroes, List<HeroResponse>> responses) {
        this.responses = responses;
    }
}
