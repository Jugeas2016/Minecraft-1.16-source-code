/*     */ import com.google.common.base.Suppliers;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class azr
/*     */ {
/*  26 */   private static final Supplier<Set<azr>> y = (Supplier<Set<azr>>)Suppliers.memoize(() -> (Set)gm.ai.g().map(bfm::b).collect(Collectors.toSet())); static {
/*  27 */     a = (☃ -> ((Set)y.get()).contains(☃));
/*     */   }
/*     */   
/*     */   public static final Predicate<azr> a;
/*     */   public static final Predicate<azr> b = ☃ -> true;
/*     */   private static final Set<ceh> z;
/*     */   
/*     */   static {
/*  35 */     z = (Set<ceh>)ImmutableList.of(bup.aL, bup.aM, bup.aI, bup.aJ, bup.aG, bup.aE, bup.aK, bup.aA, bup.aF, bup.aC, bup.az, bup.ay, (Object[])new buo[] { bup.aD, bup.aH, bup.ax, bup.aB }).stream().flatMap(☃ -> ☃.m().a().stream()).filter(☃ -> (☃.c(buj.a) == cev.a)).collect(ImmutableSet.toImmutableSet());
/*     */   }
/*  37 */   private static final Map<ceh, azr> A = Maps.newHashMap();
/*     */ 
/*     */   
/*  40 */   public static final azr c = a("unemployed", (Set<ceh>)ImmutableSet.of(), 1, a, 1);
/*  41 */   public static final azr d = a("armorer", a(bup.lU), 1, 1);
/*  42 */   public static final azr e = a("butcher", a(bup.lT), 1, 1);
/*  43 */   public static final azr f = a("cartographer", a(bup.lV), 1, 1);
/*  44 */   public static final azr g = a("cleric", a(bup.ea), 1, 1);
/*  45 */   public static final azr h = a("farmer", a(bup.na), 1, 1);
/*  46 */   public static final azr i = a("fisherman", a(bup.lS), 1, 1);
/*  47 */   public static final azr j = a("fletcher", a(bup.lW), 1, 1);
/*  48 */   public static final azr k = a("leatherworker", a(bup.eb), 1, 1);
/*  49 */   public static final azr l = a("librarian", a(bup.lY), 1, 1);
/*  50 */   public static final azr m = a("mason", a(bup.ma), 1, 1);
/*  51 */   public static final azr n = a("nitwit", (Set<ceh>)ImmutableSet.of(), 1, 1);
/*  52 */   public static final azr o = a("shepherd", a(bup.lR), 1, 1);
/*  53 */   public static final azr p = a("toolsmith", a(bup.lZ), 1, 1);
/*  54 */   public static final azr q = a("weaponsmith", a(bup.lX), 1, 1);
/*  55 */   public static final azr r = a("home", z, 1, 1);
/*  56 */   public static final azr s = a("meeting", a(bup.mb), 32, 6);
/*  57 */   public static final azr t = a("beehive", a(bup.nd), 0, 1);
/*  58 */   public static final azr u = a("bee_nest", a(bup.nc), 0, 1);
/*  59 */   public static final azr v = a("nether_portal", a(bup.cT), 0, 1);
/*  60 */   public static final azr w = a("lodestone", a(bup.no), 0, 1);
/*     */   
/*  62 */   protected static final Set<ceh> x = (Set<ceh>)new ObjectOpenHashSet(A.keySet());
/*     */   
/*     */   private final String B;
/*     */   private final Set<ceh> C;
/*     */   private final int D;
/*     */   private final Predicate<azr> E;
/*     */   private final int F;
/*     */   
/*     */   private static Set<ceh> a(buo ☃) {
/*  71 */     return (Set<ceh>)ImmutableSet.copyOf((Collection)☃.m().a());
/*     */   }
/*     */   
/*     */   private azr(String ☃, Set<ceh> set, int i, Predicate<azr> predicate, int j) {
/*  75 */     this.B = ☃;
/*  76 */     this.C = (Set<ceh>)ImmutableSet.copyOf(set);
/*  77 */     this.D = i;
/*  78 */     this.E = predicate;
/*  79 */     this.F = j;
/*     */   }
/*     */   
/*     */   private azr(String ☃, Set<ceh> set, int i, int j) {
/*  83 */     this.B = ☃;
/*  84 */     this.C = (Set<ceh>)ImmutableSet.copyOf(set);
/*  85 */     this.D = i;
/*  86 */     this.E = (☃ -> (☃ == this));
/*  87 */     this.F = j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/*  95 */     return this.D;
/*     */   }
/*     */   
/*     */   public Predicate<azr> c() {
/*  99 */     return this.E;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/* 107 */     return this.F;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 112 */     return this.B;
/*     */   }
/*     */   
/*     */   private static azr a(String ☃, Set<ceh> set, int i, int j) {
/* 116 */     return a(gm.<azr, azr>a(gm.aj, new vk(☃), new azr(☃, set, i, j)));
/*     */   }
/*     */   
/*     */   private static azr a(String ☃, Set<ceh> set, int i, Predicate<azr> predicate, int j) {
/* 120 */     return a(gm.<azr, azr>a(gm.aj, new vk(☃), new azr(☃, set, i, predicate, j)));
/*     */   }
/*     */   
/*     */   private static azr a(azr ☃) {
/* 124 */     ☃.C.forEach(ceh1 -> {
/*     */           azr azr1 = A.put(ceh1, ☃);
/*     */           
/*     */           if (azr1 != null) {
/*     */             throw (IllegalStateException)x.c(new IllegalStateException(String.format("%s is defined in too many tags", new Object[] { ceh1 })));
/*     */           }
/*     */         });
/* 131 */     return ☃;
/*     */   }
/*     */   
/*     */   public static Optional<azr> b(ceh ☃) {
/* 135 */     return Optional.ofNullable(A.get(☃));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */