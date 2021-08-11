/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class in
/*     */   implements il
/*     */ {
/*     */   private final buo a;
/*  17 */   private final List<b> b = Lists.newArrayList();
/*     */   
/*     */   private in(buo ☃) {
/*  20 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public buo a() {
/*  25 */     return this.a;
/*     */   }
/*     */   
/*     */   public static in a(buo ☃) {
/*  29 */     return new in(☃);
/*     */   }
/*     */   
/*     */   public in a(List<ir> ☃) {
/*  33 */     this.b.add(new b(☃));
/*  34 */     return this;
/*     */   }
/*     */   
/*     */   public in a(ir ☃) {
/*  38 */     return a((List<ir>)ImmutableList.of(☃));
/*     */   }
/*     */   
/*     */   public in a(im ☃, List<ir> list) {
/*  42 */     this.b.add(new a(☃, list));
/*  43 */     return this;
/*     */   }
/*     */   
/*     */   public in a(im ☃, ir... arrayOfIr) {
/*  47 */     return a(☃, (List<ir>)ImmutableList.copyOf((Object[])arrayOfIr));
/*     */   }
/*     */   
/*     */   public in a(im ☃, ir ir1) {
/*  51 */     return a(☃, (List<ir>)ImmutableList.of(ir1));
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement b() {
/*  56 */     cei<buo, ceh> ☃ = this.a.m();
/*  57 */     this.b.forEach(b1 -> b1.a(☃));
/*     */     
/*  59 */     JsonArray jsonArray = new JsonArray();
/*  60 */     this.b.stream().map(b::a).forEach(jsonArray::add);
/*     */     
/*  62 */     JsonObject jsonObject = new JsonObject();
/*  63 */     jsonObject.add("multipart", (JsonElement)jsonArray);
/*  64 */     return (JsonElement)jsonObject;
/*     */   }
/*     */   
/*     */   static class b implements Supplier<JsonElement> {
/*     */     private final List<ir> a;
/*     */     
/*     */     private b(List<ir> ☃) {
/*  71 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cei<?, ?> ☃) {}
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃) {}
/*     */ 
/*     */     
/*     */     public JsonElement a() {
/*  82 */       JsonObject ☃ = new JsonObject();
/*  83 */       a(☃);
/*  84 */       ☃.add("apply", ir.a(this.a));
/*  85 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends b {
/*     */     private final im a;
/*     */     
/*     */     private a(im ☃, List<ir> list) {
/*  93 */       super(list);
/*  94 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cei<?, ?> ☃) {
/*  99 */       this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃) {
/* 104 */       ☃.add("when", this.a.get());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\in.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */