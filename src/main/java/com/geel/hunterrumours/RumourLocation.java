package com.geel.hunterrumours;

import static com.geel.hunterrumours.Rumour.*;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@AllArgsConstructor
public enum RumourLocation
{
	TROPICAL_WAGTAIL_FELDIP_HUNTER_AREA_1(TROPICAL_WAGTAIL,"Feldip Hunter area (1)", new WorldPoint(2526,2939,0)),
	TROPICAL_WAGTAIL_FELDIP_HUNTER_AREA_2(TROPICAL_WAGTAIL,"Feldip Hunter area (2)", new WorldPoint(2511,2914,0)),
	TROPICAL_WAGTAIL_FELDIP_HUNTER_AREA_3(TROPICAL_WAGTAIL,"Feldip Hunter area (3)", new WorldPoint(2499,2890,0)),
	TROPICAL_WAGTAIL_FELDIP_HUNTER_AREA_4(TROPICAL_WAGTAIL,"Feldip Hunter area (4)", new WorldPoint(2545,2882,0)),

	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_1(WILD_KEBBIT, "Piscatoris Hunter area (1)", new WorldPoint(2307, 3577, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_2(WILD_KEBBIT, "Piscatoris Hunter area (2)", new WorldPoint(2362, 3578, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_3(WILD_KEBBIT, "Piscatoris Hunter area (3)", new WorldPoint(2350, 3563, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_4(WILD_KEBBIT, "Piscatoris Hunter area (4)", new WorldPoint(2316, 3560, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_5(WILD_KEBBIT, "Piscatoris Hunter area (5)", new WorldPoint(2330, 3552, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_6(WILD_KEBBIT, "Piscatoris Hunter area (6)", new WorldPoint(2342, 3544, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_7(WILD_KEBBIT, "Piscatoris Hunter area (7)", new WorldPoint(2306, 3541, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_8(WILD_KEBBIT, "Piscatoris Hunter area (8)", new WorldPoint(2363, 3540, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_9(WILD_KEBBIT, "Piscatoris Hunter area (9)", new WorldPoint(2315, 3523, 0)),
	WILD_KEBBIT_PISCATORIS_HUNTER_AREA_10(WILD_KEBBIT, "Piscatoris Hunter area (10)", new WorldPoint(2348, 3523, 0)),

	SAPPHIRE_GLACIALIS_RELLEKKA_HUNTER_AREA_1(SAPPHIRE_GLACIALIS, "Rellekka Hunter area (1)", new WorldPoint(2703,3822,0)),
	SAPPHIRE_GLACIALIS_RELLEKKA_HUNTER_AREA_2(SAPPHIRE_GLACIALIS, "Rellekka Hunter area (2)", new WorldPoint(2708,3822,0)),
	SAPPHIRE_GLACIALIS_RELLEKKA_HUNTER_AREA_3(SAPPHIRE_GLACIALIS, "Rellekka Hunter area (3)", new WorldPoint(2715,3808,0)),
	SAPPHIRE_GLACIALIS_RELLEKKA_HUNTER_AREA_4(SAPPHIRE_GLACIALIS, "Rellekka Hunter area (4)", new WorldPoint(2720,3805,0)),
	SAPPHIRE_GLACIALIS_RELLEKKA_HUNTER_AREA_5(SAPPHIRE_GLACIALIS, "Rellekka Hunter area (5)", new WorldPoint(2720,3834,0)),
	SAPPHIRE_GLACIALIS_RELLEKKA_HUNTER_AREA_6(SAPPHIRE_GLACIALIS, "Rellekka Hunter area (6)", new WorldPoint(2734,3823,0)),
	SAPPHIRE_GLACIALIS_FARMING_GUILD_1(SAPPHIRE_GLACIALIS, "Farming Guild (1)", new WorldPoint(1237,3746,0)),
	SAPPHIRE_GLACIALIS_FARMING_GUILD_2(SAPPHIRE_GLACIALIS, "Farming Guild (2)", new WorldPoint(1258,3746,0)),

	SWAMP_LIZARD_CANIFIS_HUNTER_AREA(SWAMP_LIZARD, "Canifis Hunter Area", new WorldPoint(3532,3446,0)),
	SWAMP_LIZARD_NORTH_WEST_OF_SLEPE(SWAMP_LIZARD, "North-west of Slepe", new WorldPoint(3684,3403,0)),

	SPINED_LARUPIA_FELDIP_HUNTER_AREA_1(SPINED_LARUPIA, "Feldip Hunter area (1)", new WorldPoint(2544,2910,0)),
	SPINED_LARUPIA_FELDIP_HUNTER_AREA_2(SPINED_LARUPIA, "Feldip Hunter area (2)", new WorldPoint(2550,2904,0)),
	SPINED_LARUPIA_FELDIP_HUNTER_AREA_3(SPINED_LARUPIA, "Feldip Hunter area (3)", new WorldPoint(2556,2895,0)),
	SPINED_LARUPIA_FELDIP_HUNTER_AREA_4(SPINED_LARUPIA, "Feldip Hunter area (4)", new WorldPoint(2563,2888,0)),
	SPINED_LARUPIA_FELDIP_HUNTER_AREA_5(SPINED_LARUPIA, "Feldip Hunter area (5)", new WorldPoint(2573,2883,0)),

	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_1(BARB_TAILED_KEBBIT, "Feldip Hunter area (1)", new WorldPoint(2572, 2931,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_2(BARB_TAILED_KEBBIT, "Feldip Hunter area (2)", new WorldPoint(2572, 2929,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_3(BARB_TAILED_KEBBIT, "Feldip Hunter area (3)", new WorldPoint(2575, 2926,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_4(BARB_TAILED_KEBBIT, "Feldip Hunter area (4)", new WorldPoint(2577, 2926,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_5(BARB_TAILED_KEBBIT, "Feldip Hunter area (5)", new WorldPoint(2575, 2916,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_6(BARB_TAILED_KEBBIT, "Feldip Hunter area (6)", new WorldPoint(2584, 2914,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_7(BARB_TAILED_KEBBIT, "Feldip Hunter area (7)", new WorldPoint(2584, 2912,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_8(BARB_TAILED_KEBBIT, "Feldip Hunter area (8)", new WorldPoint(2574, 2911,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_9(BARB_TAILED_KEBBIT, "Feldip Hunter area (9)", new WorldPoint(2574, 2909,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_10(BARB_TAILED_KEBBIT, "Feldip Hunter area (10)", new WorldPoint(2567, 2903,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_11(BARB_TAILED_KEBBIT, "Feldip Hunter area (11)", new WorldPoint(2565, 2903,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_12(BARB_TAILED_KEBBIT, "Feldip Hunter area (12)", new WorldPoint(2573, 2898,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_13(BARB_TAILED_KEBBIT, "Feldip Hunter area (13)", new WorldPoint(2573, 2896,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_14(BARB_TAILED_KEBBIT, "Feldip Hunter area (14)", new WorldPoint(2581, 2886,0)),
	BARB_TAILED_KEBBIT_FELDIP_HUNTER_AREA_15(BARB_TAILED_KEBBIT, "Feldip Hunter area (15)", new WorldPoint(2581, 2884,0)),

	SNOWY_KNIGHT_WEISS_1(SNOWY_KNIGHT, "Weiss (1)", new WorldPoint(2864,3957,0)),
	SNOWY_KNIGHT_WEISS_2(SNOWY_KNIGHT, "Weiss (2)", new WorldPoint(2870,3955,0)),
	SNOWY_KNIGHT_WEISS_3(SNOWY_KNIGHT, "Weiss (3)", new WorldPoint(2867,3954,0)),
	SNOWY_KNIGHT_WEISS_4(SNOWY_KNIGHT, "Weiss (4)", new WorldPoint(2874,3952,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_UPPER_1(SNOWY_KNIGHT, "Rellekka Hunter area (Upper level, 1)", new WorldPoint(2725,3833,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_UPPER_2(SNOWY_KNIGHT, "Rellekka Hunter area (Upper level, 2)", new WorldPoint(2708,3815,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_UPPER_3(SNOWY_KNIGHT, "Rellekka Hunter area (Upper level, 3)", new WorldPoint(2730,3806,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_1(SNOWY_KNIGHT, "Rellekka Hunter area (1)", new WorldPoint(2701,3804,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_2(SNOWY_KNIGHT, "Rellekka Hunter area (2)", new WorldPoint(2712,3797,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_3(SNOWY_KNIGHT, "Rellekka Hunter area (3)", new WorldPoint(2737,3792,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_4(SNOWY_KNIGHT, "Rellekka Hunter area (4)", new WorldPoint(2696,3786,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_5(SNOWY_KNIGHT, "Rellekka Hunter area (5)", new WorldPoint(2737,3778,0)),
	SNOWY_KNIGHT_RELLEKKA_HUNTER_AREA_6(SNOWY_KNIGHT, "Rellekka Hunter area (6)", new WorldPoint(2714,3777,0)),
	SNOWY_KNIGHT_FARMING_GUILD_1(SNOWY_KNIGHT, "Farming Guild (1)", new WorldPoint(1238,3740,0)),
	SNOWY_KNIGHT_FARMING_GUILD_2(SNOWY_KNIGHT, "Farming Guild (2)", new WorldPoint(1223,3723,0)),

	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_1(PRICKLY_KEBBIT, "Piscatoris Hunter area (1)", new WorldPoint(2321, 3644,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_2(PRICKLY_KEBBIT, "Piscatoris Hunter area (2)", new WorldPoint(2321, 3643,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_3(PRICKLY_KEBBIT, "Piscatoris Hunter area (3)", new WorldPoint(2308, 3642,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_4(PRICKLY_KEBBIT, "Piscatoris Hunter area (4)", new WorldPoint(2310, 3642,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_5(PRICKLY_KEBBIT, "Piscatoris Hunter area (5)", new WorldPoint(2342, 3641,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_6(PRICKLY_KEBBIT, "Piscatoris Hunter area (6)", new WorldPoint(2343, 3641,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_7(PRICKLY_KEBBIT, "Piscatoris Hunter area (7)", new WorldPoint(2327, 3635,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_8(PRICKLY_KEBBIT, "Piscatoris Hunter area (8)", new WorldPoint(2328, 3635,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_9(PRICKLY_KEBBIT, "Piscatoris Hunter area (9)", new WorldPoint(2336, 3632,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_10(PRICKLY_KEBBIT, "Piscatoris Hunter area (10)", new WorldPoint(2336, 3631,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_11(PRICKLY_KEBBIT, "Piscatoris Hunter area (11)", new WorldPoint(2323, 3628,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_12(PRICKLY_KEBBIT, "Piscatoris Hunter area (12)", new WorldPoint(2324, 3628,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_13(PRICKLY_KEBBIT, "Piscatoris Hunter area (13)", new WorldPoint(2307, 3621,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_14(PRICKLY_KEBBIT, "Piscatoris Hunter area (14)", new WorldPoint(2307, 3620,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_15(PRICKLY_KEBBIT, "Piscatoris Hunter area (15)", new WorldPoint(2323, 3614,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_16(PRICKLY_KEBBIT, "Piscatoris Hunter area (16)", new WorldPoint(2324, 3614,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_17(PRICKLY_KEBBIT, "Piscatoris Hunter area (17)", new WorldPoint(2307, 3606,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_18(PRICKLY_KEBBIT, "Piscatoris Hunter area (18)", new WorldPoint(2307, 3605,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_19(PRICKLY_KEBBIT, "Piscatoris Hunter area (19)", new WorldPoint(2319, 3595,0)),
	PRICKLY_KEBBIT_PISCATORIS_HUNTER_AREA_20(PRICKLY_KEBBIT, "Piscatoris Hunter area (20)", new WorldPoint(2320, 3595,0)),

	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_1(EMBERTAILED_JERBOA, "West of Hunter Guild (1)", new WorldPoint(1510,3046,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_2(EMBERTAILED_JERBOA, "West of Hunter Guild (2)", new WorldPoint(1511,3050,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_3(EMBERTAILED_JERBOA, "West of Hunter Guild (3)", new WorldPoint(1513,3043,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_4(EMBERTAILED_JERBOA, "West of Hunter Guild (4)", new WorldPoint(1515,3049,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_5(EMBERTAILED_JERBOA, "West of Hunter Guild (5)", new WorldPoint(1518,3051,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_6(EMBERTAILED_JERBOA, "West of Hunter Guild (6)", new WorldPoint(1518,3041,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_7(EMBERTAILED_JERBOA, "West of Hunter Guild (7)", new WorldPoint(1519,3045,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_8(EMBERTAILED_JERBOA, "West of Hunter Guild (8)", new WorldPoint(1521,3048,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_9(EMBERTAILED_JERBOA, "West of Hunter Guild (9)", new WorldPoint(1522,3043,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_10(EMBERTAILED_JERBOA, "West of Hunter Guild (10)", new WorldPoint(1524,3050,0)),
	EMBERTAILED_JERBOA_WEST_OF_HUNTER_GUILD_11(EMBERTAILED_JERBOA, "West of Hunter Guild (11)", new WorldPoint(1524,3046,0)),
	EMBERTAILED_JERBOA_NORTH_WEST_OF_THE_LOCUS_OASIS_1(EMBERTAILED_JERBOA, "North-west of the Locus Oasis (1)", new WorldPoint(1664,2998,0)),
	EMBERTAILED_JERBOA_NORTH_WEST_OF_THE_LOCUS_OASIS_2(EMBERTAILED_JERBOA, "North-west of the Locus Oasis (2)", new WorldPoint(1664,3003,0)),
	EMBERTAILED_JERBOA_NORTH_WEST_OF_THE_LOCUS_OASIS_3(EMBERTAILED_JERBOA, "North-west of the Locus Oasis (3)", new WorldPoint(1664,3005,0)),
	EMBERTAILED_JERBOA_NORTH_WEST_OF_THE_LOCUS_OASIS_4(EMBERTAILED_JERBOA, "North-west of the Locus Oasis (4)", new WorldPoint(1666,3006,0)),
	EMBERTAILED_JERBOA_NORTH_WEST_OF_THE_LOCUS_OASIS_5(EMBERTAILED_JERBOA, "North-west of the Locus Oasis (5)", new WorldPoint(1667,2996,0)),
	EMBERTAILED_JERBOA_NORTH_WEST_OF_THE_LOCUS_OASIS_6(EMBERTAILED_JERBOA, "North-west of the Locus Oasis (6)", new WorldPoint(1667,3001,0)),
	EMBERTAILED_JERBOA_NORTH_WEST_OF_THE_LOCUS_OASIS_7(EMBERTAILED_JERBOA, "North-west of the Locus Oasis (7)", new WorldPoint(1667,3004,0)),
	EMBERTAILED_JERBOA_NORTH_WEST_OF_THE_LOCUS_OASIS_8(EMBERTAILED_JERBOA, "North-west of the Locus Oasis (8)", new WorldPoint(1671,3005,0)),

	HORNED_GRAAHK_KARAMJA_HUNTER_AREA_1(HORNED_GRAAHK, "Karamja Hunter area (1)", new WorldPoint(2766, 3008, 0)),
	HORNED_GRAAHK_KARAMJA_HUNTER_AREA_2(HORNED_GRAAHK, "Karamja Hunter area (2)", new WorldPoint(2767, 3005, 0)),
	HORNED_GRAAHK_KARAMJA_HUNTER_AREA_3(HORNED_GRAAHK, "Karamja Hunter area (3)", new WorldPoint(2774, 3002, 0)),
	HORNED_GRAAHK_KARAMJA_HUNTER_AREA_4(HORNED_GRAAHK, "Karamja Hunter area (4)", new WorldPoint(2781, 3001, 0)),

	SPOTTED_KEBBIT_PISCATORIS_FALCONRY_AREA_1(SPOTTED_KEBBIT, "Piscatoris falconry area (1)", new WorldPoint(2391,3592,0)),
	SPOTTED_KEBBIT_PISCATORIS_FALCONRY_AREA_2(SPOTTED_KEBBIT, "Piscatoris falconry area (2)", new WorldPoint(2370,3591,0)),
	SPOTTED_KEBBIT_PISCATORIS_FALCONRY_AREA_3(SPOTTED_KEBBIT, "Piscatoris falconry area (3)", new WorldPoint(2370,3587,0)),
	SPOTTED_KEBBIT_PISCATORIS_FALCONRY_AREA_4(SPOTTED_KEBBIT, "Piscatoris falconry area (4)", new WorldPoint(2384,3586,0)),
	SPOTTED_KEBBIT_PISCATORIS_FALCONRY_AREA_5(SPOTTED_KEBBIT, "Piscatoris falconry area (5)", new WorldPoint(2379,3585,0)),
	SPOTTED_KEBBIT_PISCATORIS_FALCONRY_AREA_6(SPOTTED_KEBBIT, "Piscatoris falconry area (6)", new WorldPoint(2372,3584,0)),
	SPOTTED_KEBBIT_PISCATORIS_FALCONRY_AREA_7(SPOTTED_KEBBIT, "Piscatoris falconry area (7)", new WorldPoint(2382,0,0)),

	BLACK_WARLOCK_FELDIP_HUNTER_AREA_1(BLACK_WARLOCK, "Feldip Hunter area (1)", new WorldPoint(2563,2920,0)),
	BLACK_WARLOCK_FELDIP_HUNTER_AREA_2(BLACK_WARLOCK, "Feldip Hunter area (2)", new WorldPoint(2551,2915,0)),
	BLACK_WARLOCK_FELDIP_HUNTER_AREA_3(BLACK_WARLOCK, "Feldip Hunter area (3)", new WorldPoint(2540,2914,0)),
	BLACK_WARLOCK_FELDIP_HUNTER_AREA_4(BLACK_WARLOCK, "Feldip Hunter area (4)", new WorldPoint(2532,2905,0)),
	BLACK_WARLOCK_FELDIP_HUNTER_AREA_5(BLACK_WARLOCK, "Feldip Hunter area (5)", new WorldPoint(2540,2898,0)),
	BLACK_WARLOCK_FELDIP_HUNTER_AREA_6(BLACK_WARLOCK, "Feldip Hunter area (6)", new WorldPoint(2550,2893,0)),
	BLACK_WARLOCK_FELDIP_HUNTER_AREA_7(BLACK_WARLOCK, "Feldip Hunter area (7)", new WorldPoint(2566,2886,0)),
	BLACK_WARLOCK_IN_AND_AROUND_THE_FARMING_GUILD_1(BLACK_WARLOCK, "In and around the Farming Guild (1)", new WorldPoint(1224,3764,0)),
	BLACK_WARLOCK_IN_AND_AROUND_THE_FARMING_GUILD_2(BLACK_WARLOCK, "In and around the Farming Guild (2)", new WorldPoint(1242,3760,0)),
	BLACK_WARLOCK_IN_AND_AROUND_THE_FARMING_GUILD_3(BLACK_WARLOCK, "In and around the Farming Guild (3)", new WorldPoint(1260,3750,0)),
	BLACK_WARLOCK_IN_AND_AROUND_THE_FARMING_GUILD_4(BLACK_WARLOCK, "In and around the Farming Guild (4)", new WorldPoint(1220,3747,0)),
	BLACK_WARLOCK_IN_AND_AROUND_THE_FARMING_GUILD_5(BLACK_WARLOCK, "In and around the Farming Guild (5)", new WorldPoint(1233,3745,0)),

	ORANGE_SALAMANDER_UZER_HUNTER_AREA_1(ORANGE_SALAMANDER, "Uzer Hunter area (1)", new WorldPoint(3405, 3133, 0)),
	ORANGE_SALAMANDER_UZER_HUNTER_AREA_2(ORANGE_SALAMANDER, "Uzer Hunter area (2)", new WorldPoint(3403, 3090, 0)),
	ORANGE_SALAMANDER_UZER_HUNTER_AREA_3(ORANGE_SALAMANDER, "Uzer Hunter area (3)", new WorldPoint(3417, 3073, 0)),
	ORANGE_SALAMANDER_NECROPOLIS_HUNTER_4(ORANGE_SALAMANDER, "Necropolis Hunter area", new WorldPoint(3285, 2741,0)),

	RAZOR_BACKED_KEBBIT_PISCATORIS_HUNTER_AREA_1(RAZOR_BACKED_KEBBIT, "Piscatoris Hunter area (1)", new WorldPoint(2353,3595,0)),
	RAZOR_BACKED_KEBBIT_PISCATORIS_HUNTER_AREA_2(RAZOR_BACKED_KEBBIT, "Piscatoris Hunter area (2)", new WorldPoint(2360,3611,0)),
	RAZOR_BACKED_KEBBIT_PISCATORIS_HUNTER_AREA_3(RAZOR_BACKED_KEBBIT, "Piscatoris Hunter area (3)", new WorldPoint(2357,3624,0)),

	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_1(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (1)", new WorldPoint(2705,3780,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_2(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (2)", new WorldPoint(2715,3779,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_3(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (3)", new WorldPoint(2711,3778,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_4(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (4)", new WorldPoint(2717,3776,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_5(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (5)", new WorldPoint(2707,3774,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_6(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (6)", new WorldPoint(2712,3773,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_7(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (7)", new WorldPoint(2714,3770,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_8(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (8)", new WorldPoint(2716,3770,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_9(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (9)", new WorldPoint(2711,3768,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_10(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (10)", new WorldPoint(2715,3766,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_11(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (11)", new WorldPoint(2715,3764,0)),
	SABRE_TOOTHED_KEBBIT_RELLEKKA_HUNTER_AREA_12(SABRE_TOOTHED_KEBBIT, "Rellekka Hunter area (12)", new WorldPoint(2720,3764,0)),

	GREY_CHINCHOMPA_PISCATORIS_HUNTER_AREA_1(GREY_CHINCHOMPA, "Piscatoris Hunter area (1)", new WorldPoint(2332,3626,0)),
	GREY_CHINCHOMPA_PISCATORIS_HUNTER_AREA_2(GREY_CHINCHOMPA, "Piscatoris Hunter area (2)", new WorldPoint(2351,3534,0)),
	GREY_CHINCHOMPA_PISCATORIS_HUNTER_AREA_3(GREY_CHINCHOMPA, "Piscatoris Hunter area (3)", new WorldPoint(2317,3539,0)),
	GREY_CHINCHOMPA_PISCATORIS_HUNTER_AREA_4(GREY_CHINCHOMPA, "Piscatoris Hunter area (4)", new WorldPoint(2350,3540,0)),
	GREY_CHINCHOMPA_PISCATORIS_HUNTER_AREA_5(GREY_CHINCHOMPA, "Piscatoris Hunter area (5)", new WorldPoint(2341,3618,0)),
	GREY_CHINCHOMPA_PISCATORIS_HUNTER_AREA_6(GREY_CHINCHOMPA, "Piscatoris Hunter area (6)", new WorldPoint(2321,3611,0)),
	GREY_CHINCHOMPA_PISCATORIS_HUNTER_AREA_7(GREY_CHINCHOMPA, "Piscatoris Hunter area (7)", new WorldPoint(2339,3593,0)),
	GREY_CHINCHOMPA_KOUREND_WOODLAND(GREY_CHINCHOMPA, "Kourend Woodland", new WorldPoint(1480,3503,0)),
	GREY_CHINCHOMPA_ISLE_OF_SOULS(GREY_CHINCHOMPA, "Isle of Souls", new WorldPoint(2126,2949,0)),

	SABRE_TOOTHED_KYAT_RELLEKKA_HUNTER_AREA_1(SABRE_TOOTHED_KYATT, "Rellekka Hunter area (1)", new WorldPoint(2708,3796,0)),
	SABRE_TOOTHED_KYAT_RELLEKKA_HUNTER_AREA_2(SABRE_TOOTHED_KYATT, "Rellekka Hunter area (2)", new WorldPoint(2725,3791,0)),
	SABRE_TOOTHED_KYAT_RELLEKKA_HUNTER_AREA_3(SABRE_TOOTHED_KYATT, "Rellekka Hunter area (3)", new WorldPoint(2696,3790,0)),
	SABRE_TOOTHED_KYAT_RELLEKKA_HUNTER_AREA_4(SABRE_TOOTHED_KYATT, "Rellekka Hunter area (4)", new WorldPoint(2702,3790,0)),
	SABRE_TOOTHED_KYAT_RELLEKKA_HUNTER_AREA_5(SABRE_TOOTHED_KYATT, "Rellekka Hunter area (5)", new WorldPoint(2741,3790,0)),
	SABRE_TOOTHED_KYAT_RELLEKKA_HUNTER_AREA_6(SABRE_TOOTHED_KYATT, "Rellekka Hunter area (6)", new WorldPoint(2734,3780,0)),

	DARK_KEBBIT_PISCATORIS_FALCONRY_AREA_1(DARK_KEBBIT, "Piscatoris falconry area (1)", new WorldPoint(2389,3598,0)),
	DARK_KEBBIT_PISCATORIS_FALCONRY_AREA_2(DARK_KEBBIT, "Piscatoris falconry area (2)", new WorldPoint(2368,3594,0)),
	DARK_KEBBIT_PISCATORIS_FALCONRY_AREA_3(DARK_KEBBIT, "Piscatoris falconry area (3)", new WorldPoint(2388,3590,0)),
	DARK_KEBBIT_PISCATORIS_FALCONRY_AREA_4(DARK_KEBBIT, "Piscatoris falconry area (4)", new WorldPoint(2368,3589,0)),
	DARK_KEBBIT_PISCATORIS_FALCONRY_AREA_5(DARK_KEBBIT, "Piscatoris falconry area (5)", new WorldPoint(2380,3581,0)),
	DARK_KEBBIT_PISCATORIS_FALCONRY_AREA_6(DARK_KEBBIT, "Piscatoris falconry area (6)", new WorldPoint(2365,3579,0)),
	DARK_KEBBIT_PISCATORIS_FALCONRY_AREA_7(DARK_KEBBIT, "Piscatoris falconry area (7)", new WorldPoint(2374,3575,0)),

	PYRE_FOX_AVIUM_SAVANNAH_1(PYRE_FOX, "Avium Savannah (1)", new WorldPoint(1613,2995,0)),
	PYRE_FOX_AVIUM_SAVANNAH_2(PYRE_FOX, "Avium Savannah (2)", new WorldPoint(1617,2997,0)),
	PYRE_FOX_AVIUM_SAVANNAH_3(PYRE_FOX, "Avium Savannah (3)", new WorldPoint(1621,2994,0)),
	PYRE_FOX_AVIUM_SAVANNAH_4(PYRE_FOX, "Avium Savannah (4)", new WorldPoint(1616,3003,0)),
	PYRE_FOX_AVIUM_SAVANNAH_5(PYRE_FOX, "Avium Savannah (5)", new WorldPoint(1613,3001,0)),

	RED_SALAMANDER_OURANIA_HUNTER_AREA_1(RED_SALAMANDER, "Ourania Hunter area (1)", new WorldPoint(2464,3251,0)),
	RED_SALAMANDER_OURANIA_HUNTER_AREA_2(RED_SALAMANDER, "Ourania Hunter area (2)", new WorldPoint(2468,3242,0)),
	RED_SALAMANDER_OURANIA_HUNTER_AREA_3(RED_SALAMANDER, "Ourania Hunter area (3)", new WorldPoint(2472,3239,0)),
	RED_SALAMANDER_OURANIA_HUNTER_AREA_4(RED_SALAMANDER, "Ourania Hunter area (4)", new WorldPoint(2474,3237,0)),
	RED_SALAMANDER_OURANIA_HUNTER_AREA_5(RED_SALAMANDER, "Ourania Hunter area (5)", new WorldPoint(2476,3236,0)),
	RED_SALAMANDER_OURANIA_HUNTER_AREA_6(RED_SALAMANDER, "Ourania Hunter area (6)", new WorldPoint(2449,3226,0)),
	RED_SALAMANDER_OURANIA_HUNTER_AREA_7(RED_SALAMANDER, "Ourania Hunter area (7)", new WorldPoint(2448,3225,0)),
	RED_SALAMANDER_OURANIA_HUNTER_AREA_8(RED_SALAMANDER, "Ourania Hunter area (8)", new WorldPoint(2449,3224,0)),
	RED_SALAMANDER_OURANIA_HUNTER_AREA_9(RED_SALAMANDER, "Ourania Hunter area (9)", new WorldPoint(2453,3221,0)),

	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_1(RED_CHINCHOMPA, "Gwenith Hunter area (1)", new WorldPoint(2266,3411,0)),
	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_2(RED_CHINCHOMPA, "Gwenith Hunter area (2)", new WorldPoint(2268,3409,0)),
	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_3(RED_CHINCHOMPA, "Gwenith Hunter area (3)", new WorldPoint(2269,3413,0)),
	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_4(RED_CHINCHOMPA, "Gwenith Hunter area (4)", new WorldPoint(2271,3411,0)),
	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_5(RED_CHINCHOMPA, "Gwenith Hunter area (5)", new WorldPoint(2273,3404,0)),
	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_6(RED_CHINCHOMPA, "Gwenith Hunter area (6)", new WorldPoint(2275,3407,0)),
	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_7(RED_CHINCHOMPA, "Gwenith Hunter area (7)", new WorldPoint(2276,3401,0)),
	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_8(RED_CHINCHOMPA, "Gwenith Hunter area (8)", new WorldPoint(2277,3404,0)),
	RED_CHINCHOMPA_GWENITH_HUNTER_AREA_9(RED_CHINCHOMPA, "Gwenith Hunter area (9)", new WorldPoint(2279,3405,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_1(RED_CHINCHOMPA, "Feldip Hunter Area (1)", new WorldPoint(2557,2936,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_2(RED_CHINCHOMPA, "Feldip Hunter Area (2)", new WorldPoint(2553,2935,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_3(RED_CHINCHOMPA, "Feldip Hunter Area (3)", new WorldPoint(2557,2932,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_4(RED_CHINCHOMPA, "Feldip Hunter Area (4)", new WorldPoint(2559,2918,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_5(RED_CHINCHOMPA, "Feldip Hunter Area (5)", new WorldPoint(2556,2914,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_6(RED_CHINCHOMPA, "Feldip Hunter Area (6)", new WorldPoint(2559,2911,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_7(RED_CHINCHOMPA, "Feldip Hunter Area (7)", new WorldPoint(2497,2909,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_8(RED_CHINCHOMPA, "Feldip Hunter Area (8)", new WorldPoint(2501,2906,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_9(RED_CHINCHOMPA, "Feldip Hunter Area (9)", new WorldPoint(2497,2901,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_10(RED_CHINCHOMPA, "Feldip Hunter Area (10)", new WorldPoint(2507,2885,0)),
	RED_CHINCHOMPA_FELDIP_HUNTER_AREA_11(RED_CHINCHOMPA, "Feldip Hunter Area (11)", new WorldPoint(2503,2881,0)),

	MOONLIGHT_ANTELOPE_HUNTERS_GUILD_1(MOONLIGHT_ANTELOPE, "Hunters' Guild (1)", new WorldPoint(1555, 9416, 0)),
	MOONLIGHT_ANTELOPE_HUNTERS_GUILD_2(MOONLIGHT_ANTELOPE, "Hunters' Guild (2)", new WorldPoint(1562, 9417, 0)),
	MOONLIGHT_ANTELOPE_HUNTERS_GUILD_3(MOONLIGHT_ANTELOPE, "Hunters' Guild (3)", new WorldPoint(1557, 9422, 0)),
	MOONLIGHT_ANTELOPE_HUNTERS_GUILD_4(MOONLIGHT_ANTELOPE, "Hunters' Guild (4)", new WorldPoint(1561, 9421, 0)),

	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_1(HERBIBOAR, "Mushroom Forest on Fossil Island (1)", new WorldPoint(3710, 3883, 0)),
	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_2(HERBIBOAR, "Mushroom Forest on Fossil Island (2)", new WorldPoint(3697, 3876, 0)),
	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_3(HERBIBOAR, "Mushroom Forest on Fossil Island (3)", new WorldPoint(3683, 3870, 0)),
	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_4(HERBIBOAR, "Mushroom Forest on Fossil Island (4)", new WorldPoint(3681, 3865, 0)),
	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_5(HERBIBOAR, "Mushroom Forest on Fossil Island (5)", new WorldPoint(3753, 3851, 0)),
	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_6(HERBIBOAR, "Mushroom Forest on Fossil Island (6)", new WorldPoint(3717, 3840, 0)),
	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_7(HERBIBOAR, "Mushroom Forest on Fossil Island (7)", new WorldPoint(3705, 3827, 0)),
	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_8(HERBIBOAR, "Mushroom Forest on Fossil Island (8)", new WorldPoint(3704, 3808, 0)),
	HERBIBOAR_MUSHROOM_FOREST_FOSSIL_ISLAND_9(HERBIBOAR, "Mushroom Forest on Fossil Island (9)", new WorldPoint(3696, 3796, 0)),

	TECU_SALAMANDER_RALOS_RISE_1(TECU_SALAMANDER, "Ralos' Rise (1)", new WorldPoint(1471, 3087, 0)),
	TECU_SALAMANDER_RALOS_RISE_2(TECU_SALAMANDER, "Ralos' Rise (2)", new WorldPoint(1472, 3096, 0)),
	TECU_SALAMANDER_RALOS_RISE_3(TECU_SALAMANDER, "Ralos' Rise (3)", new WorldPoint(1473, 3086, 0)),
	TECU_SALAMANDER_RALOS_RISE_4(TECU_SALAMANDER, "Ralos' Rise (4)", new WorldPoint(1475, 3101, 0)),
	TECU_SALAMANDER_RALOS_RISE_5(TECU_SALAMANDER, "Ralos' Rise (5)", new WorldPoint(1477, 3099, 0)),

	MOONLIGHT_MOTH_NEYPOTZLI_1(MOONLIGHT_MOTH, "Neypotzli (1)", new WorldPoint(1554, 9433, 0)),
	MOONLIGHT_MOTH_NEYPOTZLI_2(MOONLIGHT_MOTH, "Neypotzli (2)", new WorldPoint(1349, 9574, 0)),
	MOONLIGHT_MOTH_NEYPOTZLI_3(MOONLIGHT_MOTH, "Neypotzli (3)", new WorldPoint(1481, 9690, 0)),
	MOONLIGHT_MOTH_NEYPOTZLI_4(MOONLIGHT_MOTH, "Neypotzli (4)", new WorldPoint(1507, 9677, 0)),

	MOONLIGHT_MOTH_HUNTER_GUILD_1(MOONLIGHT_MOTH, "Hunter Guild (1)", new WorldPoint(1562, 9441, 0)),
	MOONLIGHT_MOTH_HUNTER_GUILD_2(MOONLIGHT_MOTH, "Hunter Guild (2)", new WorldPoint(1573, 9441, 0)),
	MOONLIGHT_MOTH_HUNTER_GUILD_3(MOONLIGHT_MOTH, "Hunter Guild (3)", new WorldPoint(1570, 9444, 0)),
	MOONLIGHT_MOTH_HUNTER_GUILD_4(MOONLIGHT_MOTH, "Hunter Guild (4)", new WorldPoint(1573, 9446, 0)),
	MOONLIGHT_MOTH_HUNTER_GUILD_5(MOONLIGHT_MOTH, "Hunter Guild (5)", new WorldPoint(1554, 9443, 0)),
	MOONLIGHT_MOTH_HUNTER_GUILD_6(MOONLIGHT_MOTH, "Hunter Guild (6)", new WorldPoint(1568, 9439, 0)),
	MOONLIGHT_MOTH_HUNTER_GUILD_7(MOONLIGHT_MOTH, "Hunter Guild (7)", new WorldPoint(1557, 9427, 0)),
	MOONLIGHT_MOTH_HUNTER_GUILD_8(MOONLIGHT_MOTH, "Hunter Guild (8)", new WorldPoint(1565, 9432, 0)),

	SUNLIGHT_ANTELOPE_AVIUM_SAVANNAH_1(SUNLIGHT_ANTELOPE, "Avium Savannah (1)", new WorldPoint(1735, 3008, 0)),
	SUNLIGHT_ANTELOPE_AVIUM_SAVANNAH_2(SUNLIGHT_ANTELOPE, "Avium Savannah (2)", new WorldPoint(1738, 3003, 0)),
	SUNLIGHT_ANTELOPE_AVIUM_SAVANNAH_3(SUNLIGHT_ANTELOPE, "Avium Savannah (3)", new WorldPoint(1744, 3006, 0)),
	SUNLIGHT_ANTELOPE_AVIUM_SAVANNAH_4(SUNLIGHT_ANTELOPE, "Avium Savannah (4)", new WorldPoint(1746, 3011, 0)),
	SUNLIGHT_ANTELOPE_AVIUM_SAVANNAH_5(SUNLIGHT_ANTELOPE, "Avium Savannah (5)", new WorldPoint(1749, 3016, 0)),
	SUNLIGHT_ANTELOPE_AVIUM_SAVANNAH_6(SUNLIGHT_ANTELOPE, "Avium Savannah (6)", new WorldPoint(1750, 3001, 0)),
	SUNLIGHT_ANTELOPE_AVIUM_SAVANNAH_7(SUNLIGHT_ANTELOPE, "Avium Savannah (7)", new WorldPoint(1754, 3006, 0)),
	SUNLIGHT_ANTELOPE_AVIUM_SAVANNAH_8(SUNLIGHT_ANTELOPE, "Avium Savannah (8)", new WorldPoint(1755, 3013, 0)),

	DASHING_KEBBIT_PISCATORIS_FALCONRY_AREA_1(DASHING_KEBBIT, "Piscatoris falconry area (1)", new WorldPoint(2390, 3588, 0)),
	DASHING_KEBBIT_PISCATORIS_FALCONRY_AREA_2(DASHING_KEBBIT, "Piscatoris falconry area (2)", new WorldPoint(2375, 3578, 0)),
	DASHING_KEBBIT_PISCATORIS_FALCONRY_AREA_3(DASHING_KEBBIT, "Piscatoris falconry area (3)", new WorldPoint(2367, 3576, 0)),

	SUNLIGHT_MOTH_AVIUM_SAVANNAH_1(SUNLIGHT_MOTH, "Avium Savannah (1)", new WorldPoint(1550, 3016, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_2(SUNLIGHT_MOTH, "Avium Savannah (2)", new WorldPoint(1551, 3013, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_3(SUNLIGHT_MOTH, "Avium Savannah (3)", new WorldPoint(1553, 3016, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_4(SUNLIGHT_MOTH, "Avium Savannah (4)", new WorldPoint(1555, 3012, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_5(SUNLIGHT_MOTH, "Avium Savannah (5)", new WorldPoint(1556, 3016, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_6(SUNLIGHT_MOTH, "Avium Savannah (6)", new WorldPoint(1558, 3015, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_7(SUNLIGHT_MOTH, "Avium Savannah (7)", new WorldPoint(1559, 3015, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_8(SUNLIGHT_MOTH, "Avium Savannah (8)", new WorldPoint(1735, 3012, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_9(SUNLIGHT_MOTH, "Avium Savannah (9)", new WorldPoint(1565, 3016, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_10(SUNLIGHT_MOTH, "Avium Savannah (10)", new WorldPoint(1568, 3011, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_11(SUNLIGHT_MOTH, "Avium Savannah (11)", new WorldPoint(1568, 3020, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_12(SUNLIGHT_MOTH, "Avium Savannah (12)", new WorldPoint(1571, 3016, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_13(SUNLIGHT_MOTH, "Avium Savannah (13)", new WorldPoint(1573, 3024, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_14(SUNLIGHT_MOTH, "Avium Savannah (14)", new WorldPoint(1575, 3021, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_15(SUNLIGHT_MOTH, "Avium Savannah (15)", new WorldPoint(1576, 3017, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_16(SUNLIGHT_MOTH, "Avium Savannah (16)", new WorldPoint(1576, 3023, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_17(SUNLIGHT_MOTH, "Avium Savannah (17)", new WorldPoint(1577, 3024, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_18(SUNLIGHT_MOTH, "Avium Savannah (18)", new WorldPoint(1578, 3021, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_19(SUNLIGHT_MOTH, "Avium Savannah (19)", new WorldPoint(1582, 3024, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_20(SUNLIGHT_MOTH, "Avium Savannah (20)", new WorldPoint(1582, 3031, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_21(SUNLIGHT_MOTH, "Avium Savannah (21)", new WorldPoint(1583, 3011, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_22(SUNLIGHT_MOTH, "Avium Savannah (22)", new WorldPoint(1584, 3021, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_23(SUNLIGHT_MOTH, "Avium Savannah (23)", new WorldPoint(1585, 3009, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_24(SUNLIGHT_MOTH, "Avium Savannah (24)", new WorldPoint(1585, 3026, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_25(SUNLIGHT_MOTH, "Avium Savannah (25)", new WorldPoint(1586, 3013, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_26(SUNLIGHT_MOTH, "Avium Savannah (26)", new WorldPoint(1586, 3020, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_27(SUNLIGHT_MOTH, "Avium Savannah (27)", new WorldPoint(1588, 3024, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_28(SUNLIGHT_MOTH, "Avium Savannah (28)", new WorldPoint(1588, 3027, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_29(SUNLIGHT_MOTH, "Avium Savannah (29)", new WorldPoint(1589, 3010, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_30(SUNLIGHT_MOTH, "Avium Savannah (30)", new WorldPoint(1590, 3036, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_31(SUNLIGHT_MOTH, "Avium Savannah (31)", new WorldPoint(1592, 3012, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_32(SUNLIGHT_MOTH, "Avium Savannah (32)", new WorldPoint(1596, 3020, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_33(SUNLIGHT_MOTH, "Avium Savannah (33)", new WorldPoint(1598, 3016, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_34(SUNLIGHT_MOTH, "Avium Savannah (34)", new WorldPoint(1598, 3029, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_35(SUNLIGHT_MOTH, "Avium Savannah (35)", new WorldPoint(1551, 3089, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_36(SUNLIGHT_MOTH, "Avium Savannah (36)", new WorldPoint(1551, 3094, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_37(SUNLIGHT_MOTH, "Avium Savannah (37)", new WorldPoint(1553, 3091, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_38(SUNLIGHT_MOTH, "Avium Savannah (38)", new WorldPoint(1555, 3085, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_39(SUNLIGHT_MOTH, "Avium Savannah (39)", new WorldPoint(1554, 3095, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_40(SUNLIGHT_MOTH, "Avium Savannah (40)", new WorldPoint(1556, 3091, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_41(SUNLIGHT_MOTH, "Avium Savannah (41)", new WorldPoint(1557, 3085, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_42(SUNLIGHT_MOTH, "Avium Savannah (42)", new WorldPoint(1556, 3088, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_43(SUNLIGHT_MOTH, "Avium Savannah (43)", new WorldPoint(1557, 3094, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_44(SUNLIGHT_MOTH, "Avium Savannah (44)", new WorldPoint(1560, 3086, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_45(SUNLIGHT_MOTH, "Avium Savannah (45)", new WorldPoint(1561, 3092, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_46(SUNLIGHT_MOTH, "Avium Savannah (46)", new WorldPoint(1560, 3094, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_47(SUNLIGHT_MOTH, "Avium Savannah (47)", new WorldPoint(1562, 3088, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_48(SUNLIGHT_MOTH, "Avium Savannah (48)", new WorldPoint(1562, 3093, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_49(SUNLIGHT_MOTH, "Avium Savannah (49)", new WorldPoint(1564, 3087, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_50(SUNLIGHT_MOTH, "Avium Savannah (50)", new WorldPoint(1568, 2995, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_51(SUNLIGHT_MOTH, "Avium Savannah (51)", new WorldPoint(1570, 2987, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_52(SUNLIGHT_MOTH, "Avium Savannah (52)", new WorldPoint(1570, 2998, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_53(SUNLIGHT_MOTH, "Avium Savannah (53)", new WorldPoint(1572, 2995, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_54(SUNLIGHT_MOTH, "Avium Savannah (54)", new WorldPoint(1572, 3003, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_55(SUNLIGHT_MOTH, "Avium Savannah (55)", new WorldPoint(1575, 3000, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_56(SUNLIGHT_MOTH, "Avium Savannah (56)", new WorldPoint(1578, 2986, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_57(SUNLIGHT_MOTH, "Avium Savannah (57)", new WorldPoint(1579, 2991, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_58(SUNLIGHT_MOTH, "Avium Savannah (58)", new WorldPoint(1580, 2995, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_59(SUNLIGHT_MOTH, "Avium Savannah (59)", new WorldPoint(1582, 3002, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_60(SUNLIGHT_MOTH, "Avium Savannah (60)", new WorldPoint(1584, 2991, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_61(SUNLIGHT_MOTH, "Avium Savannah (61)", new WorldPoint(1584, 2999, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_62(SUNLIGHT_MOTH, "Avium Savannah (62)", new WorldPoint(1588, 2994, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_63(SUNLIGHT_MOTH, "Avium Savannah (63)", new WorldPoint(1588, 3008, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_64(SUNLIGHT_MOTH, "Avium Savannah (64)", new WorldPoint(1590, 2998, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_65(SUNLIGHT_MOTH, "Avium Savannah (65)", new WorldPoint(1591, 2988, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_66(SUNLIGHT_MOTH, "Avium Savannah (66)", new WorldPoint(1592, 2983, 0)),
	SUNLIGHT_MOTH_AVIUM_SAVANNAH_67(SUNLIGHT_MOTH, "Avium Savannah (67)", new WorldPoint(1596, 2985, 0)),

	SUNLIGHT_MOTH_AVIUM_NEYPOTZLI_1(SUNLIGHT_MOTH, "Neypotzli (1)", new WorldPoint(1434, 9632, 0)),
	SUNLIGHT_MOTH_AVIUM_NEYPOTZLI_2(SUNLIGHT_MOTH, "Neypotzli (2)", new WorldPoint(1437, 9636, 0)),
	SUNLIGHT_MOTH_AVIUM_NEYPOTZLI_3(SUNLIGHT_MOTH, "Neypotzli (3)", new WorldPoint(1441, 9626, 0)),
	SUNLIGHT_MOTH_AVIUM_NEYPOTZLI_4(SUNLIGHT_MOTH, "Neypotzli (4)", new WorldPoint(1444, 9633, 0));

	@Getter
	private final Rumour Rumour;

	@Getter
	private final String LocationName;

	@Getter
	private final WorldPoint WorldPoint;

	public static Set<RumourLocation> getLocationsForRumour(Rumour rumour) {
		return Arrays.stream(RumourLocation.values()).filter(loc -> loc.getRumour() == rumour).collect(Collectors.toSet());
	}
}
