/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.EnumMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class adu
/*     */ {
/*  14 */   private static final Map<bjk, Pair<String, String>> a = (Map<bjk, Pair<String, String>>)ImmutableMap.of(bjk.a, 
/*  15 */       Pair.of("isGuiOpen", "isFilteringCraftable"), bjk.b, 
/*  16 */       Pair.of("isFurnaceGuiOpen", "isFurnaceFilteringCraftable"), bjk.c, 
/*  17 */       Pair.of("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable"), bjk.d, 
/*  18 */       Pair.of("isSmokerGuiOpen", "isSmokerFilteringCraftable"));
/*     */   private final Map<bjk, a> b;
/*     */   
/*     */   static final class a {
/*     */     private boolean a;
/*     */     private boolean b;
/*     */     
/*     */     public a(boolean ☃, boolean bool1) {
/*  26 */       this.a = ☃;
/*  27 */       this.b = bool1;
/*     */     }
/*     */     
/*     */     public a a() {
/*  31 */       return new a(this.a, this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/*  36 */       if (this == ☃) {
/*  37 */         return true;
/*     */       }
/*     */       
/*  40 */       if (☃ instanceof a) {
/*  41 */         a a1 = (a)☃;
/*  42 */         return (this.a == a1.a && this.b == a1.b);
/*     */       } 
/*  44 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/*  49 */       int ☃ = this.a ? 1 : 0;
/*  50 */       ☃ = 31 * ☃ + (this.b ? 1 : 0);
/*  51 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  56 */       return "[open=" + this.a + ", filtering=" + this.b + ']';
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private adu(Map<bjk, a> ☃) {
/*  63 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public adu() {
/*  67 */     this(x.<Map<bjk, a>>a(Maps.newEnumMap(bjk.class), ☃ -> {
/*     */             for (bjk bjk : bjk.values()) {
/*     */               ☃.put(bjk, new a(false, false));
/*     */             }
/*     */           }));
/*     */   }
/*     */   
/*     */   public boolean a(bjk ☃) {
/*  75 */     return a.a(this.b.get(☃));
/*     */   }
/*     */   
/*     */   public void a(bjk ☃, boolean bool) {
/*  79 */     a.a(this.b.get(☃), bool);
/*     */   }
/*     */   
/*     */   public boolean b(bjk ☃) {
/*  83 */     return a.b(this.b.get(☃));
/*     */   }
/*     */   
/*     */   public void b(bjk ☃, boolean bool) {
/*  87 */     a.b(this.b.get(☃), bool);
/*     */   }
/*     */   
/*     */   public static adu a(nf ☃) {
/*  91 */     Map<bjk, a> map = Maps.newEnumMap(bjk.class);
/*  92 */     for (bjk bjk : bjk.values()) {
/*  93 */       boolean bool1 = ☃.readBoolean();
/*  94 */       boolean bool2 = ☃.readBoolean();
/*  95 */       map.put(bjk, new a(bool1, bool2));
/*     */     } 
/*  97 */     return new adu(map);
/*     */   }
/*     */   
/*     */   public void b(nf ☃) {
/* 101 */     for (bjk bjk : bjk.values()) {
/* 102 */       a a = this.b.get(bjk);
/* 103 */       if (a == null) {
/* 104 */         ☃.writeBoolean(false);
/* 105 */         ☃.writeBoolean(false);
/*     */       } else {
/* 107 */         ☃.writeBoolean(a.a(a));
/* 108 */         ☃.writeBoolean(a.b(a));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static adu a(md ☃) {
/* 114 */     Map<bjk, a> map = Maps.newEnumMap(bjk.class);
/* 115 */     a.forEach((bjk1, pair) -> {
/*     */           boolean bool1 = ☃.q((String)pair.getFirst());
/*     */           boolean bool2 = ☃.q((String)pair.getSecond());
/*     */           map.put(bjk1, new a(bool1, bool2));
/*     */         });
/* 120 */     return new adu(map);
/*     */   }
/*     */   
/*     */   public void b(md ☃) {
/* 124 */     a.forEach((bjk1, pair) -> {
/*     */           a a = this.b.get(bjk1);
/*     */           ☃.a((String)pair.getFirst(), a.a(a));
/*     */           ☃.a((String)pair.getSecond(), a.b(a));
/*     */         });
/*     */   }
/*     */   
/*     */   public adu a() {
/* 132 */     Map<bjk, a> ☃ = Maps.newEnumMap(bjk.class);
/* 133 */     for (bjk bjk : bjk.values()) {
/* 134 */       a a = this.b.get(bjk);
/* 135 */       ☃.put(bjk, a.a());
/*     */     } 
/* 137 */     return new adu(☃);
/*     */   }
/*     */   
/*     */   public void a(adu ☃) {
/* 141 */     this.b.clear();
/* 142 */     for (bjk bjk : bjk.values()) {
/* 143 */       a a = ☃.b.get(bjk);
/* 144 */       this.b.put(bjk, a.a());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 150 */     return (this == ☃ || (☃ instanceof adu && this.b.equals(((adu)☃).b)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 155 */     return this.b.hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */