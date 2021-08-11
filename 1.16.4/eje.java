/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
/*     */ import java.io.IOException;
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
/*     */ 
/*     */ public class eje<T extends aqm & bfl, M extends duc<T> & dwe>
/*     */   extends eit<T, M>
/*     */   implements aci
/*     */ {
/*     */   private static final Int2ObjectMap<vk> a;
/*     */   
/*     */   static {
/*  31 */     a = (Int2ObjectMap<vk>)x.a(new Int2ObjectOpenHashMap(), ☃ -> {
/*     */           ☃.put(1, new vk("stone"));
/*     */           ☃.put(2, new vk("iron"));
/*     */           ☃.put(3, new vk("gold"));
/*     */           ☃.put(4, new vk("emerald"));
/*     */           ☃.put(5, new vk("diamond"));
/*     */         });
/*     */   }
/*  39 */   private final Object2ObjectMap<bfo, ele.a> b = (Object2ObjectMap<bfo, ele.a>)new Object2ObjectOpenHashMap();
/*  40 */   private final Object2ObjectMap<bfm, ele.a> c = (Object2ObjectMap<bfm, ele.a>)new Object2ObjectOpenHashMap();
/*     */   
/*     */   private final acf d;
/*     */   private final String e;
/*     */   
/*     */   public eje(egk<T, M> ☃, acf acf1, String str) {
/*  46 */     super(☃);
/*  47 */     this.d = acf1;
/*  48 */     this.e = str;
/*     */     
/*  50 */     acf1.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, int i, T t, float f1, float f2, float f3, float f4, float f5, float f6) {
/*  55 */     if (t.bF()) {
/*     */       return;
/*     */     }
/*     */     
/*  59 */     bfk bfk = ((bfl)t).eX();
/*  60 */     bfo bfo = bfk.a();
/*  61 */     bfm bfm = bfk.b();
/*     */     
/*  63 */     ele.a a1 = a(this.b, "type", gm.ah, bfo);
/*  64 */     ele.a a2 = a(this.c, "profession", gm.ai, bfm);
/*     */     
/*  66 */     M m = aC_();
/*     */     
/*  68 */     ((dwe)m).a((a2 == ele.a.a || (a2 == ele.a.b && a1 != ele.a.c)));
/*  69 */     vk vk = a("type", gm.ah.b(bfo));
/*  70 */     a((duc<T>)m, vk, ☃, eag1, i, t, 1.0F, 1.0F, 1.0F);
/*  71 */     ((dwe)m).a(true);
/*     */     
/*  73 */     if (bfm != bfm.a && !t.w_()) {
/*  74 */       vk vk1 = a("profession", gm.ai.b(bfm));
/*  75 */       a((duc<T>)m, vk1, ☃, eag1, i, t, 1.0F, 1.0F, 1.0F);
/*  76 */       if (bfm != bfm.l) {
/*  77 */         vk vk2 = a("profession_level", (vk)a.get(afm.a(bfk.c(), 1, a.size())));
/*  78 */         a((duc<T>)m, vk2, ☃, eag1, i, t, 1.0F, 1.0F, 1.0F);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private vk a(String ☃, vk vk1) {
/*  84 */     return new vk(vk1.b(), "textures/entity/" + this.e + "/" + ☃ + "/" + vk1.a() + ".png");
/*     */   }
/*     */   
/*     */   public <K> ele.a a(Object2ObjectMap<K, ele.a> ☃, String str, gb<K> gb1, K k) {
/*  88 */     return (ele.a)☃.computeIfAbsent(k, object2 -> {
/*     */           try (acg ☃ = this.d.a(a(☃, gb1.b(object1)))) {
/*     */             ele ele = acg.<ele>a(ele.a);
/*     */ 
/*     */             
/*     */             if (ele != null) {
/*     */               return ele.a();
/*     */             }
/*  96 */           } catch (IOException iOException) {}
/*     */           return ele.a.a;
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ach ☃) {
/* 105 */     this.c.clear();
/* 106 */     this.b.clear();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eje.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */