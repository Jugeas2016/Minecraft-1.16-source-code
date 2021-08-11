/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dae
/*     */   extends dai
/*     */ {
/*  29 */   private static final Logger d = LogManager.getLogger();
/*  30 */   public static final cla<?> a = cla.p;
/*     */   
/*  32 */   public static final cxu.a b = cxu.a.i;
/*     */   
/*     */   private final cla<?> e;
/*     */   
/*     */   private final cxu.a f;
/*     */   
/*     */   private final byte g;
/*     */   
/*     */   private final int h;
/*     */   private final boolean i;
/*     */   
/*     */   private dae(dbo[] ☃, cla<?> cla1, cxu.a a1, byte b, int i, boolean bool) {
/*  44 */     super(☃);
/*  45 */     this.e = cla1;
/*  46 */     this.f = a1;
/*  47 */     this.g = b;
/*  48 */     this.h = i;
/*  49 */     this.i = bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/*  54 */     return dal.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<daz<?>> a() {
/*  59 */     return (Set<daz<?>>)ImmutableSet.of(dbc.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, cyv cyv1) {
/*  64 */     if (☃.b() != bmd.pc) {
/*  65 */       return ☃;
/*     */     }
/*     */     
/*  68 */     dcn dcn = cyv1.<dcn>c(dbc.f);
/*  69 */     if (dcn != null) {
/*  70 */       aag aag = cyv1.c();
/*     */       
/*  72 */       fx fx = aag.a(this.e, new fx(dcn), this.h, this.i);
/*  73 */       if (fx != null) {
/*  74 */         bmb bmb1 = bmh.a(aag, fx.u(), fx.w(), this.g, true, true);
/*  75 */         bmh.a(aag, bmb1);
/*  76 */         cxx.a(bmb1, fx, "+", this.f);
/*  77 */         bmb1.a(new of("filled_map." + this.e.i().toLowerCase(Locale.ROOT)));
/*  78 */         return bmb1;
/*     */       } 
/*     */     } 
/*     */     
/*  82 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a extends dai.a<a> {
/*  86 */     private cla<?> a = dae.a;
/*  87 */     private cxu.a b = dae.b;
/*  88 */     private byte c = 2;
/*  89 */     private int d = 50;
/*     */     
/*     */     private boolean e = true;
/*     */     
/*     */     protected a a() {
/*  94 */       return this;
/*     */     }
/*     */     
/*     */     public a a(cla<?> ☃) {
/*  98 */       this.a = ☃;
/*  99 */       return this;
/*     */     }
/*     */     
/*     */     public a a(cxu.a ☃) {
/* 103 */       this.b = ☃;
/* 104 */       return this;
/*     */     }
/*     */     
/*     */     public a a(byte ☃) {
/* 108 */       this.c = ☃;
/* 109 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(boolean ☃) {
/* 118 */       this.e = ☃;
/* 119 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public daj b() {
/* 124 */       return new dae(g(), this.a, this.b, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */   
/*     */   public static a c() {
/* 129 */     return new a();
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends dai.c<dae> {
/*     */     public void a(JsonObject ☃, dae dae1, JsonSerializationContext jsonSerializationContext) {
/* 135 */       super.a(☃, dae1, jsonSerializationContext);
/*     */       
/* 137 */       if (!dae.a(dae1).equals(dae.a)) {
/* 138 */         ☃.add("destination", jsonSerializationContext.serialize(dae.a(dae1).i()));
/*     */       }
/*     */       
/* 141 */       if (dae.b(dae1) != dae.b) {
/* 142 */         ☃.add("decoration", jsonSerializationContext.serialize(dae.b(dae1).toString().toLowerCase(Locale.ROOT)));
/*     */       }
/*     */       
/* 145 */       if (dae.c(dae1) != 2) {
/* 146 */         ☃.addProperty("zoom", Byte.valueOf(dae.c(dae1)));
/*     */       }
/*     */       
/* 149 */       if (dae.d(dae1) != 50) {
/* 150 */         ☃.addProperty("search_radius", Integer.valueOf(dae.d(dae1)));
/*     */       }
/*     */       
/* 153 */       if (dae.e(dae1) != true) {
/* 154 */         ☃.addProperty("skip_existing_chunks", Boolean.valueOf(dae.e(dae1)));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public dae a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 160 */       cla<?> cla = a(☃);
/*     */       
/* 162 */       String str = ☃.has("decoration") ? afd.h(☃, "decoration") : "mansion";
/* 163 */       cxu.a a = dae.b;
/*     */       try {
/* 165 */         a = cxu.a.valueOf(str.toUpperCase(Locale.ROOT));
/* 166 */       } catch (IllegalArgumentException illegalArgumentException) {
/* 167 */         dae.d().error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + dae.b, str);
/*     */       } 
/*     */       
/* 170 */       byte b1 = afd.a(☃, "zoom", (byte)2);
/*     */       
/* 172 */       int i = afd.a(☃, "search_radius", 50);
/*     */       
/* 174 */       boolean bool = afd.a(☃, "skip_existing_chunks", true);
/*     */       
/* 176 */       return new dae(arrayOfDbo, cla, a, b1, i, bool);
/*     */     }
/*     */     
/*     */     private static cla<?> a(JsonObject ☃) {
/* 180 */       if (☃.has("destination")) {
/* 181 */         String str = afd.h(☃, "destination");
/* 182 */         cla<?> cla = (cla)cla.a.get(str.toLowerCase(Locale.ROOT));
/* 183 */         if (cla != null) {
/* 184 */           return cla;
/*     */         }
/*     */       } 
/* 187 */       return dae.a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */