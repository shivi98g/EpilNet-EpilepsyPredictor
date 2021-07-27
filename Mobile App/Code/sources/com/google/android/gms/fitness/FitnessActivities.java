package com.google.android.gms.fitness;

import android.util.SparseArray;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.Field;

public class FitnessActivities {
    public static final String AEROBICS = "aerobics";
    public static final String BADMINTON = "badminton";
    public static final String BASEBALL = "baseball";
    public static final String BASKETBALL = "basketball";
    public static final String BIATHLON = "biathlon";
    public static final String BIKING = "biking";
    public static final String BIKING_HAND = "biking.hand";
    public static final String BIKING_MOUNTAIN = "biking.mountain";
    public static final String BIKING_ROAD = "biking.road";
    public static final String BIKING_SPINNING = "biking.spinning";
    public static final String BIKING_STATIONARY = "biking.stationary";
    public static final String BIKING_UTILITY = "biking.utility";
    public static final String BOXING = "boxing";
    public static final String CALISTHENICS = "calisthenics";
    public static final String CIRCUIT_TRAINING = "circuit_training";
    public static final String CRICKET = "cricket";
    public static final String CURLING = "curling";
    public static final String DANCING = "dancing";
    public static final String DIVING = "diving";
    public static final String ELLIPTICAL = "elliptical";
    public static final String ERGOMETER = "ergometer";
    public static final String EXTRA_STATUS = "actionStatus";
    public static final String FENCING = "fencing";
    public static final String FOOTBALL_AMERICAN = "football.american";
    public static final String FOOTBALL_AUSTRALIAN = "football.australian";
    public static final String FOOTBALL_SOCCER = "football.soccer";
    public static final String FRISBEE_DISC = "frisbee_disc";
    public static final String GARDENING = "gardening";
    public static final String GOLF = "golf";
    public static final String GYMNASTICS = "gymnastics";
    public static final String HANDBALL = "handball";
    public static final String HIKING = "hiking";
    public static final String HOCKEY = "hockey";
    public static final String HORSEBACK_RIDING = "horseback_riding";
    public static final String HOUSEWORK = "housework";
    public static final String ICE_SKATING = "ice_skating";
    public static final String IN_VEHICLE = "in_vehicle";
    public static final String JUMP_ROPE = "jump_rope";
    public static final String KAYAKING = "kayaking";
    public static final String KETTLEBELL_TRAINING = "kettlebell_training";
    public static final String KICKBOXING = "kickboxing";
    public static final String KICK_SCOOTER = "kick_scooter";
    public static final String KITESURFING = "kitesurfing";
    public static final String MARTIAL_ARTS = "martial_arts";
    public static final String MEDITATION = "meditation";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.activity/";
    public static final String MIXED_MARTIAL_ARTS = "martial_arts.mixed";
    public static final String ON_FOOT = "on_foot";
    public static final String OTHER = "other";
    public static final String P90X = "p90x";
    public static final String PARAGLIDING = "paragliding";
    public static final String PILATES = "pilates";
    public static final String POLO = "polo";
    public static final String RACQUETBALL = "racquetball";
    public static final String ROCK_CLIMBING = "rock_climbing";
    public static final String ROWING = "rowing";
    public static final String ROWING_MACHINE = "rowing.machine";
    public static final String RUGBY = "rugby";
    public static final String RUNNING = "running";
    public static final String RUNNING_JOGGING = "running.jogging";
    public static final String RUNNING_SAND = "running.sand";
    public static final String RUNNING_TREADMILL = "running.treadmill";
    public static final String SAILING = "sailing";
    public static final String SCUBA_DIVING = "scuba_diving";
    public static final String SKATEBOARDING = "skateboarding";
    public static final String SKATING = "skating";
    public static final String SKATING_CROSS = "skating.cross";
    public static final String SKATING_INDOOR = "skating.indoor";
    public static final String SKATING_INLINE = "skating.inline";
    public static final String SKIING = "skiing";
    public static final String SKIING_BACK_COUNTRY = "skiing.back_country";
    public static final String SKIING_CROSS_COUNTRY = "skiing.cross_country";
    public static final String SKIING_DOWNHILL = "skiing.downhill";
    public static final String SKIING_KITE = "skiing.kite";
    public static final String SKIING_ROLLER = "skiing.roller";
    public static final String SLEDDING = "sledding";
    public static final String SLEEP = "sleep";
    public static final String SNOWBOARDING = "snowboarding";
    public static final String SNOWMOBILE = "snowmobile";
    public static final String SNOWSHOEING = "snowshoeing";
    public static final String SQUASH = "squash";
    public static final String STAIR_CLIMBING = "stair_climbing";
    public static final String STAIR_CLIMBING_MACHINE = "stair_climbing.machine";
    public static final String STANDUP_PADDLEBOARDING = "standup_paddleboarding";
    public static final String STATUS_ACTIVE = "ActiveActionStatus";
    public static final String STATUS_COMPLETED = "CompletedActionStatus";
    public static final String STILL = "still";
    public static final String STRENGTH_TRAINING = "strength_training";
    public static final String SURFING = "surfing";
    public static final String SWIMMING = "swimming";
    public static final String SWIMMING_OPEN_WATER = "swimming.open_water";
    public static final String SWIMMING_POOL = "swimming.pool";
    public static final String TABLE_TENNIS = "table_tennis";
    public static final String TEAM_SPORTS = "team_sports";
    public static final String TENNIS = "tennis";
    public static final String TILTING = "tilting";

    /* renamed from: TL */
    private static final SparseArray<String> f1323TL = new SparseArray<>(109);
    public static final String TREADMILL = "treadmill";
    public static final String UNKNOWN = "unknown";
    public static final String VOLLEYBALL = "volleyball";
    public static final String VOLLEYBALL_BEACH = "volleyball.beach";
    public static final String VOLLEYBALL_INDOOR = "volleyball.indoor";
    public static final String WAKEBOARDING = "wakeboarding";
    public static final String WALKING = "walking";
    public static final String WALKING_FITNESS = "walking.fitness";
    public static final String WALKING_NORDIC = "walking.nordic";
    public static final String WALKING_TREADMILL = "walking.treadmill";
    public static final String WATER_POLO = "water_polo";
    public static final String WEIGHTLIFTING = "weightlifting";
    public static final String WHEELCHAIR = "wheelchair";
    public static final String WINDSURFING = "windsurfing";
    public static final String YOGA = "yoga";
    public static final String ZUMBA = "zumba";

    static {
        f1323TL.put(9, AEROBICS);
        f1323TL.put(10, BADMINTON);
        f1323TL.put(11, BASEBALL);
        f1323TL.put(12, BASKETBALL);
        f1323TL.put(13, BIATHLON);
        f1323TL.put(1, BIKING);
        f1323TL.put(14, BIKING_HAND);
        f1323TL.put(15, BIKING_MOUNTAIN);
        f1323TL.put(16, BIKING_ROAD);
        f1323TL.put(17, BIKING_SPINNING);
        f1323TL.put(18, BIKING_STATIONARY);
        f1323TL.put(19, BIKING_UTILITY);
        f1323TL.put(20, BOXING);
        f1323TL.put(21, CALISTHENICS);
        f1323TL.put(22, CIRCUIT_TRAINING);
        f1323TL.put(23, CRICKET);
        f1323TL.put(106, CURLING);
        f1323TL.put(24, DANCING);
        f1323TL.put(102, DIVING);
        f1323TL.put(25, ELLIPTICAL);
        f1323TL.put(103, ERGOMETER);
        f1323TL.put(6, "exiting_vehicle");
        f1323TL.put(26, FENCING);
        f1323TL.put(27, FOOTBALL_AMERICAN);
        f1323TL.put(28, FOOTBALL_AUSTRALIAN);
        f1323TL.put(29, FOOTBALL_SOCCER);
        f1323TL.put(30, FRISBEE_DISC);
        f1323TL.put(31, GARDENING);
        f1323TL.put(32, GOLF);
        f1323TL.put(33, GYMNASTICS);
        f1323TL.put(34, HANDBALL);
        f1323TL.put(35, HIKING);
        f1323TL.put(36, HOCKEY);
        f1323TL.put(37, HORSEBACK_RIDING);
        f1323TL.put(38, HOUSEWORK);
        f1323TL.put(104, ICE_SKATING);
        f1323TL.put(0, IN_VEHICLE);
        f1323TL.put(39, JUMP_ROPE);
        f1323TL.put(40, KAYAKING);
        f1323TL.put(41, KETTLEBELL_TRAINING);
        f1323TL.put(107, KICK_SCOOTER);
        f1323TL.put(42, KICKBOXING);
        f1323TL.put(43, KITESURFING);
        f1323TL.put(44, MARTIAL_ARTS);
        f1323TL.put(45, MEDITATION);
        f1323TL.put(46, MIXED_MARTIAL_ARTS);
        f1323TL.put(2, ON_FOOT);
        f1323TL.put(108, OTHER);
        f1323TL.put(47, P90X);
        f1323TL.put(48, PARAGLIDING);
        f1323TL.put(49, PILATES);
        f1323TL.put(50, POLO);
        f1323TL.put(51, RACQUETBALL);
        f1323TL.put(52, ROCK_CLIMBING);
        f1323TL.put(53, ROWING);
        f1323TL.put(54, ROWING_MACHINE);
        f1323TL.put(55, RUGBY);
        f1323TL.put(8, RUNNING);
        f1323TL.put(56, RUNNING_JOGGING);
        f1323TL.put(57, RUNNING_SAND);
        f1323TL.put(58, RUNNING_TREADMILL);
        f1323TL.put(59, SAILING);
        f1323TL.put(60, SCUBA_DIVING);
        f1323TL.put(61, SKATEBOARDING);
        f1323TL.put(62, SKATING);
        f1323TL.put(63, SKATING_CROSS);
        f1323TL.put(105, SKATING_INDOOR);
        f1323TL.put(64, SKATING_INLINE);
        f1323TL.put(65, SKIING);
        f1323TL.put(66, SKIING_BACK_COUNTRY);
        f1323TL.put(67, SKIING_CROSS_COUNTRY);
        f1323TL.put(68, SKIING_DOWNHILL);
        f1323TL.put(69, SKIING_KITE);
        f1323TL.put(70, SKIING_ROLLER);
        f1323TL.put(71, SLEDDING);
        f1323TL.put(72, SLEEP);
        f1323TL.put(73, SNOWBOARDING);
        f1323TL.put(74, SNOWMOBILE);
        f1323TL.put(75, SNOWSHOEING);
        f1323TL.put(76, SQUASH);
        f1323TL.put(77, STAIR_CLIMBING);
        f1323TL.put(78, STAIR_CLIMBING_MACHINE);
        f1323TL.put(79, STANDUP_PADDLEBOARDING);
        f1323TL.put(3, STILL);
        f1323TL.put(80, STRENGTH_TRAINING);
        f1323TL.put(81, SURFING);
        f1323TL.put(82, SWIMMING);
        f1323TL.put(83, SWIMMING_POOL);
        f1323TL.put(84, SWIMMING_OPEN_WATER);
        f1323TL.put(85, TABLE_TENNIS);
        f1323TL.put(86, TEAM_SPORTS);
        f1323TL.put(87, TENNIS);
        f1323TL.put(5, TILTING);
        f1323TL.put(88, TREADMILL);
        f1323TL.put(4, "unknown");
        f1323TL.put(89, VOLLEYBALL);
        f1323TL.put(90, VOLLEYBALL_BEACH);
        f1323TL.put(91, VOLLEYBALL_INDOOR);
        f1323TL.put(92, WAKEBOARDING);
        f1323TL.put(7, WALKING);
        f1323TL.put(93, WALKING_FITNESS);
        f1323TL.put(94, WALKING_NORDIC);
        f1323TL.put(95, WALKING_TREADMILL);
        f1323TL.put(96, WATER_POLO);
        f1323TL.put(97, WEIGHTLIFTING);
        f1323TL.put(98, WHEELCHAIR);
        f1323TL.put(99, WINDSURFING);
        f1323TL.put(100, YOGA);
        f1323TL.put(101, ZUMBA);
    }

    FitnessActivities() {
    }

    /* renamed from: bs */
    public static int m1627bs(String str) {
        int keyAt;
        int indexOfValue = f1323TL.indexOfValue(str);
        if (indexOfValue >= 0 && (keyAt = f1323TL.keyAt(indexOfValue)) <= 108) {
            return keyAt;
        }
        return 4;
    }

    public static String getMimeType(String str) {
        return MIME_TYPE_PREFIX + str;
    }

    public static String getName(int i) {
        String str = f1323TL.get(i);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unknown activity " + i);
    }

    @Deprecated
    public static String getValue(DataPoint dataPoint) {
        return dataPoint.getValue(Field.FIELD_ACTIVITY).asActivity();
    }

    @Deprecated
    public static void setValue(DataPoint dataPoint, String str) {
        dataPoint.getValue(Field.FIELD_ACTIVITY).setActivity(str);
    }
}
