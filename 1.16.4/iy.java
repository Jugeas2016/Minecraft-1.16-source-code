/*     */ import java.util.Optional;
/*     */ import java.util.stream.IntStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class iy
/*     */ {
/*   9 */   public static final ix a = a("cube", new ja[] { ja.c, ja.j, ja.k, ja.l, ja.m, ja.n, ja.o });
/*  10 */   public static final ix b = a("cube_directional", new ja[] { ja.c, ja.j, ja.k, ja.l, ja.m, ja.n, ja.o });
/*  11 */   public static final ix c = a("cube_all", new ja[] { ja.a });
/*  12 */   public static final ix d = a("cube_mirrored_all", "_mirrored", new ja[] { ja.a });
/*  13 */   public static final ix e = a("cube_column", new ja[] { ja.d, ja.i });
/*  14 */   public static final ix f = a("cube_column_horizontal", "_horizontal", new ja[] { ja.d, ja.i });
/*  15 */   public static final ix g = a("cube_top", new ja[] { ja.f, ja.i });
/*  16 */   public static final ix h = a("cube_bottom_top", new ja[] { ja.f, ja.e, ja.i });
/*  17 */   public static final ix i = a("orientable", new ja[] { ja.f, ja.g, ja.i });
/*  18 */   public static final ix j = a("orientable_with_bottom", new ja[] { ja.f, ja.e, ja.i, ja.g });
/*  19 */   public static final ix k = a("orientable_vertical", "_vertical", new ja[] { ja.g, ja.i });
/*     */   
/*  21 */   public static final ix l = a("button", new ja[] { ja.b });
/*  22 */   public static final ix m = a("button_pressed", "_pressed", new ja[] { ja.b });
/*  23 */   public static final ix n = a("button_inventory", "_inventory", new ja[] { ja.b });
/*     */   
/*  25 */   public static final ix o = a("door_bottom", "_bottom", new ja[] { ja.f, ja.e });
/*  26 */   public static final ix p = a("door_bottom_rh", "_bottom_hinge", new ja[] { ja.f, ja.e });
/*  27 */   public static final ix q = a("door_top", "_top", new ja[] { ja.f, ja.e });
/*  28 */   public static final ix r = a("door_top_rh", "_top_hinge", new ja[] { ja.f, ja.e });
/*     */   
/*  30 */   public static final ix s = a("fence_post", "_post", new ja[] { ja.b });
/*  31 */   public static final ix t = a("fence_side", "_side", new ja[] { ja.b });
/*  32 */   public static final ix u = a("fence_inventory", "_inventory", new ja[] { ja.b });
/*     */   
/*  34 */   public static final ix v = a("template_wall_post", "_post", new ja[] { ja.r });
/*  35 */   public static final ix w = a("template_wall_side", "_side", new ja[] { ja.r });
/*  36 */   public static final ix x = a("template_wall_side_tall", "_side_tall", new ja[] { ja.r });
/*  37 */   public static final ix y = a("wall_inventory", "_inventory", new ja[] { ja.r });
/*     */   
/*  39 */   public static final ix z = a("template_fence_gate", new ja[] { ja.b });
/*  40 */   public static final ix A = a("template_fence_gate_open", "_open", new ja[] { ja.b });
/*  41 */   public static final ix B = a("template_fence_gate_wall", "_wall", new ja[] { ja.b });
/*  42 */   public static final ix C = a("template_fence_gate_wall_open", "_wall_open", new ja[] { ja.b });
/*     */   
/*  44 */   public static final ix D = a("pressure_plate_up", new ja[] { ja.b });
/*  45 */   public static final ix E = a("pressure_plate_down", "_down", new ja[] { ja.b });
/*     */   
/*  47 */   public static final ix F = a(new ja[] { ja.c });
/*     */   
/*  49 */   public static final ix G = a("slab", new ja[] { ja.e, ja.f, ja.i });
/*  50 */   public static final ix H = a("slab_top", "_top", new ja[] { ja.e, ja.f, ja.i });
/*     */   
/*  52 */   public static final ix I = a("leaves", new ja[] { ja.a });
/*     */   
/*  54 */   public static final ix J = a("stairs", new ja[] { ja.e, ja.f, ja.i });
/*  55 */   public static final ix K = a("inner_stairs", "_inner", new ja[] { ja.e, ja.f, ja.i });
/*  56 */   public static final ix L = a("outer_stairs", "_outer", new ja[] { ja.e, ja.f, ja.i });
/*     */   
/*  58 */   public static final ix M = a("template_trapdoor_top", "_top", new ja[] { ja.b });
/*  59 */   public static final ix N = a("template_trapdoor_bottom", "_bottom", new ja[] { ja.b });
/*  60 */   public static final ix O = a("template_trapdoor_open", "_open", new ja[] { ja.b });
/*     */   
/*  62 */   public static final ix P = a("template_orientable_trapdoor_top", "_top", new ja[] { ja.b });
/*  63 */   public static final ix Q = a("template_orientable_trapdoor_bottom", "_bottom", new ja[] { ja.b });
/*  64 */   public static final ix R = a("template_orientable_trapdoor_open", "_open", new ja[] { ja.b });
/*     */   
/*  66 */   public static final ix S = a("cross", new ja[] { ja.p });
/*  67 */   public static final ix T = a("tinted_cross", new ja[] { ja.p });
/*     */   
/*  69 */   public static final ix U = a("flower_pot_cross", new ja[] { ja.q });
/*  70 */   public static final ix V = a("tinted_flower_pot_cross", new ja[] { ja.q });
/*     */   
/*  72 */   public static final ix W = a("rail_flat", new ja[] { ja.s });
/*  73 */   public static final ix X = a("rail_curved", "_corner", new ja[] { ja.s });
/*  74 */   public static final ix Y = a("template_rail_raised_ne", "_raised_ne", new ja[] { ja.s });
/*  75 */   public static final ix Z = a("template_rail_raised_sw", "_raised_sw", new ja[] { ja.s });
/*     */   
/*  77 */   public static final ix aa = a("carpet", new ja[] { ja.t });
/*  78 */   public static final ix ab = a("coral_fan", new ja[] { ja.x });
/*  79 */   public static final ix ac = a("coral_wall_fan", new ja[] { ja.x });
/*  80 */   public static final ix ad = a("template_glazed_terracotta", new ja[] { ja.u });
/*  81 */   public static final ix ae = a("template_chorus_flower", new ja[] { ja.b });
/*  82 */   public static final ix af = a("template_daylight_detector", new ja[] { ja.f, ja.i });
/*     */   
/*  84 */   public static final ix ag = a("template_glass_pane_noside", "_noside", new ja[] { ja.v });
/*  85 */   public static final ix ah = a("template_glass_pane_noside_alt", "_noside_alt", new ja[] { ja.v });
/*  86 */   public static final ix ai = a("template_glass_pane_post", "_post", new ja[] { ja.v, ja.w });
/*  87 */   public static final ix aj = a("template_glass_pane_side", "_side", new ja[] { ja.v, ja.w });
/*  88 */   public static final ix ak = a("template_glass_pane_side_alt", "_side_alt", new ja[] { ja.v, ja.w });
/*     */   
/*  90 */   public static final ix al = a("template_command_block", new ja[] { ja.g, ja.h, ja.i }); public static final ix[] an;
/*  91 */   public static final ix am = a("template_anvil", new ja[] { ja.f }); static {
/*  92 */     an = (ix[])IntStream.range(0, 8).mapToObj(☃ -> a("stem_growth" + ☃, "_stage" + ☃, new ja[] { ja.y })).toArray(☃ -> new ix[☃]);
/*  93 */   } public static final ix ao = a("stem_fruit", new ja[] { ja.y, ja.z });
/*  94 */   public static final ix ap = a("crop", new ja[] { ja.A });
/*  95 */   public static final ix aq = a("template_farmland", new ja[] { ja.B, ja.f });
/*     */   
/*  97 */   public static final ix ar = a("template_fire_floor", new ja[] { ja.C });
/*  98 */   public static final ix as = a("template_fire_side", new ja[] { ja.C });
/*  99 */   public static final ix at = a("template_fire_side_alt", new ja[] { ja.C });
/* 100 */   public static final ix au = a("template_fire_up", new ja[] { ja.C });
/* 101 */   public static final ix av = a("template_fire_up_alt", new ja[] { ja.C });
/*     */   
/* 103 */   public static final ix aw = a("template_campfire", new ja[] { ja.C, ja.I });
/*     */   
/* 105 */   public static final ix ax = a("template_lantern", new ja[] { ja.D });
/* 106 */   public static final ix ay = a("template_hanging_lantern", "_hanging", new ja[] { ja.D });
/*     */   
/* 108 */   public static final ix az = a("template_torch", new ja[] { ja.G });
/* 109 */   public static final ix aA = a("template_torch_wall", new ja[] { ja.G });
/*     */   
/* 111 */   public static final ix aB = a("template_piston", new ja[] { ja.E, ja.e, ja.i });
/* 112 */   public static final ix aC = a("template_piston_head", new ja[] { ja.E, ja.i, ja.F });
/* 113 */   public static final ix aD = a("template_piston_head_short", new ja[] { ja.E, ja.i, ja.F });
/* 114 */   public static final ix aE = a("template_seagrass", new ja[] { ja.b });
/* 115 */   public static final ix aF = a("template_turtle_egg", new ja[] { ja.a });
/* 116 */   public static final ix aG = a("template_two_turtle_eggs", new ja[] { ja.a });
/* 117 */   public static final ix aH = a("template_three_turtle_eggs", new ja[] { ja.a });
/* 118 */   public static final ix aI = a("template_four_turtle_eggs", new ja[] { ja.a });
/* 119 */   public static final ix aJ = a("template_single_face", new ja[] { ja.b });
/*     */   
/* 121 */   public static final ix aK = b("generated", new ja[] { ja.H });
/* 122 */   public static final ix aL = b("handheld", new ja[] { ja.H });
/* 123 */   public static final ix aM = b("handheld_rod", new ja[] { ja.H });
/* 124 */   public static final ix aN = b("template_shulker_box", new ja[] { ja.c });
/* 125 */   public static final ix aO = b("template_bed", new ja[] { ja.c });
/* 126 */   public static final ix aP = b("template_banner", new ja[0]);
/* 127 */   public static final ix aQ = b("template_skull", new ja[0]);
/*     */   
/*     */   private static ix a(ja... ☃) {
/* 130 */     return new ix(Optional.empty(), Optional.empty(), ☃);
/*     */   }
/*     */   
/*     */   private static ix a(String ☃, ja... arrayOfJa) {
/* 134 */     return new ix(Optional.of(new vk("minecraft", "block/" + ☃)), Optional.empty(), arrayOfJa);
/*     */   }
/*     */   
/*     */   private static ix b(String ☃, ja... arrayOfJa) {
/* 138 */     return new ix(Optional.of(new vk("minecraft", "item/" + ☃)), Optional.empty(), arrayOfJa);
/*     */   }
/*     */   
/*     */   private static ix a(String ☃, String str1, ja... arrayOfJa) {
/* 142 */     return new ix(Optional.of(new vk("minecraft", "block/" + ☃)), Optional.of(str1), arrayOfJa);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\iy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */