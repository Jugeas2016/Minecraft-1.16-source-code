/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.Set;
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
/*     */ public class dam
/*     */   extends dai
/*     */ {
/*     */   private final czd a;
/*     */   private final int b;
/*     */   
/*     */   private dam(dbo[] ☃, czd czd1, int i) {
/*  26 */     super(☃);
/*  27 */     this.a = czd1;
/*  28 */     this.b = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/*  33 */     return dal.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<daz<?>> a() {
/*  38 */     return (Set<daz<?>>)ImmutableSet.of(dbc.d);
/*     */   }
/*     */   
/*     */   private boolean c() {
/*  42 */     return (this.b > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, cyv cyv1) {
/*  47 */     aqa aqa = cyv1.<aqa>c(dbc.d);
/*     */     
/*  49 */     if (aqa instanceof aqm) {
/*  50 */       int i = bpu.g((aqm)aqa);
/*  51 */       if (i == 0) {
/*  52 */         return ☃;
/*     */       }
/*  54 */       float f = i * this.a.b(cyv1.a());
/*  55 */       ☃.f(Math.round(f));
/*     */       
/*  57 */       if (c() && ☃.E() > this.b) {
/*  58 */         ☃.e(this.b);
/*     */       }
/*     */     } 
/*     */     
/*  62 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a extends dai.a<a> {
/*     */     private final czd a;
/*  67 */     private int b = 0;
/*     */     
/*     */     public a(czd ☃) {
/*  70 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     protected a a() {
/*  75 */       return this;
/*     */     }
/*     */     
/*     */     public a a(int ☃) {
/*  79 */       this.b = ☃;
/*  80 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public daj b() {
/*  85 */       return new dam(g(), this.a, this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public static a a(czd ☃) {
/*  90 */     return new a(☃);
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends dai.c<dam> {
/*     */     public void a(JsonObject ☃, dam dam1, JsonSerializationContext jsonSerializationContext) {
/*  96 */       super.a(☃, dam1, jsonSerializationContext);
/*     */       
/*  98 */       ☃.add("count", jsonSerializationContext.serialize(dam.a(dam1)));
/*  99 */       if (dam.b(dam1)) {
/* 100 */         ☃.add("limit", jsonSerializationContext.serialize(Integer.valueOf(dam.c(dam1))));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public dam a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 106 */       int i = afd.a(☃, "limit", 0);
/* 107 */       return new dam(arrayOfDbo, afd.<czd>a(☃, "count", jsonDeserializationContext, czd.class), i);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */