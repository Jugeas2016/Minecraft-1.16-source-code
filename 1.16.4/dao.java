/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dao
/*    */   extends dai
/*    */ {
/*    */   private final List<czq> a;
/*    */   
/*    */   private dao(dbo[] ☃, List<czq> list) {
/* 27 */     super(☃);
/* 28 */     this.a = (List<czq>)ImmutableList.copyOf(list);
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 33 */     return dal.n;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 38 */     if (☃.a()) {
/* 39 */       return ☃;
/*    */     }
/*    */     
/* 42 */     gj<bmb> gj = gj.a();
/* 43 */     this.a.forEach(czq1 -> czq1.expand(☃, ()));
/*    */     
/* 45 */     md md1 = new md();
/* 46 */     aoo.a(md1, gj);
/* 47 */     md md2 = ☃.p();
/* 48 */     md2.a("BlockEntityTag", md1.a(md2.p("BlockEntityTag")));
/* 49 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 54 */     super.a(☃);
/*    */     
/* 56 */     for (int i = 0; i < this.a.size(); i++)
/* 57 */       ((czq)this.a.get(i)).a(☃.b(".entry[" + i + "]")); 
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends dai.a<a> {
/* 62 */     private final List<czq> a = Lists.newArrayList();
/*    */ 
/*    */     
/*    */     protected a a() {
/* 66 */       return this;
/*    */     }
/*    */     
/*    */     public a a(czq.a<?> ☃) {
/* 70 */       this.a.add(☃.b());
/* 71 */       return this;
/*    */     }
/*    */ 
/*    */     
/*    */     public daj b() {
/* 76 */       return new dao(g(), this.a);
/*    */     }
/*    */   }
/*    */   
/*    */   public static a c() {
/* 81 */     return new a();
/*    */   }
/*    */   
/*    */   public static class b
/*    */     extends dai.c<dao> {
/*    */     public void a(JsonObject ☃, dao dao1, JsonSerializationContext jsonSerializationContext) {
/* 87 */       super.a(☃, dao1, jsonSerializationContext);
/*    */       
/* 89 */       ☃.add("entries", jsonSerializationContext.serialize(dao.a(dao1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dao a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 94 */       czq[] arrayOfCzq = afd.<czq[]>a(☃, "entries", jsonDeserializationContext, (Class)czq[].class);
/* 95 */       return new dao(arrayOfDbo, Arrays.asList(arrayOfCzq));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */