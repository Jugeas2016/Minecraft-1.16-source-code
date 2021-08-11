/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
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
/*    */ public class ecs<T extends cdl>
/*    */   extends ece<T>
/*    */ {
/* 19 */   public static final vk a = new vk("textures/environment/end_sky.png");
/* 20 */   public static final vk c = new vk("textures/entity/end_portal.png");
/*    */   private static final List<eao> e;
/* 22 */   private static final Random d = new Random(31100L); static {
/* 23 */     e = (List<eao>)IntStream.range(0, 16).mapToObj(☃ -> eao.a(☃ + 1)).collect(ImmutableList.toImmutableList());
/*    */   }
/*    */   public ecs(ecd ☃) {
/* 26 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/* 31 */     d.setSeed(31100L);
/*    */     
/* 33 */     double d = ☃.o().a(this.b.d.b(), true);
/* 34 */     int k = a(d);
/* 35 */     float f1 = a();
/*    */     
/* 37 */     b b = dfm1.c().a();
/*    */     
/* 39 */     a(☃, f1, 0.15F, b, eag1.getBuffer(e.get(0)));
/*    */     
/* 41 */     for (int m = 1; m < k; m++) {
/* 42 */       a(☃, f1, 2.0F / (18 - m), b, eag1.getBuffer(e.get(m)));
/*    */     }
/*    */   }
/*    */   
/*    */   private void a(T ☃, float f1, float f2, b b1, dfq dfq1) {
/* 47 */     float f3 = (d.nextFloat() * 0.5F + 0.1F) * f2;
/* 48 */     float f4 = (d.nextFloat() * 0.5F + 0.4F) * f2;
/* 49 */     float f5 = (d.nextFloat() * 0.5F + 0.5F) * f2;
/*    */     
/* 51 */     a(☃, b1, dfq1, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, f3, f4, f5, gc.d);
/* 52 */     a(☃, b1, dfq1, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f3, f4, f5, gc.c);
/* 53 */     a(☃, b1, dfq1, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, f3, f4, f5, gc.f);
/* 54 */     a(☃, b1, dfq1, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, f3, f4, f5, gc.e);
/* 55 */     a(☃, b1, dfq1, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f3, f4, f5, gc.a);
/* 56 */     a(☃, b1, dfq1, 0.0F, 1.0F, f1, f1, 1.0F, 1.0F, 0.0F, 0.0F, f3, f4, f5, gc.b);
/*    */   }
/*    */   
/*    */   private void a(T ☃, b b1, dfq dfq1, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, gc gc1) {
/* 60 */     if (☃.a(gc1)) {
/* 61 */       dfq1.a(b1, f1, f3, f5).a(f9, f10, f11, 1.0F).d();
/* 62 */       dfq1.a(b1, f2, f3, f6).a(f9, f10, f11, 1.0F).d();
/* 63 */       dfq1.a(b1, f2, f4, f7).a(f9, f10, f11, 1.0F).d();
/* 64 */       dfq1.a(b1, f1, f4, f8).a(f9, f10, f11, 1.0F).d();
/*    */     } 
/*    */   }
/*    */   
/*    */   protected int a(double ☃) {
/* 69 */     if (☃ > 36864.0D)
/* 70 */       return 1; 
/* 71 */     if (☃ > 25600.0D)
/* 72 */       return 3; 
/* 73 */     if (☃ > 16384.0D)
/* 74 */       return 5; 
/* 75 */     if (☃ > 9216.0D)
/* 76 */       return 7; 
/* 77 */     if (☃ > 4096.0D)
/* 78 */       return 9; 
/* 79 */     if (☃ > 1024.0D)
/* 80 */       return 11; 
/* 81 */     if (☃ > 576.0D)
/* 82 */       return 13; 
/* 83 */     if (☃ > 256.0D) {
/* 84 */       return 14;
/*    */     }
/* 86 */     return 15;
/*    */   }
/*    */   
/*    */   protected float a() {
/* 90 */     return 0.75F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */